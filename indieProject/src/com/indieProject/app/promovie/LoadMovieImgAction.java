package com.indieProject.app.promovie;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;

public class LoadMovieImgAction implements Action{
	private WebDriver driver;
	private String url;
	
    public static final String WEB_DRIVER_ID ="webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH ="C:\\chromedriver.exe";

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		
		url = "https://indieground.kr/indie/releaseList.do";
		WebElement el1 = null;
    	List<WebElement> el2 = null;
    	List<WebElement> el3 = null;
    	
    	driver.get(url);
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	el1 = driver.findElement(By.id("viewBtn"));//더보기 버튼
		
		//동적
		el1.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		el2 = driver.findElements(By.className("library_img"));
		List<WebElement> img = null;
		JSONObject jsonImg = new JSONObject();
		
		for(int i = 0; i < el2.size(); i++) {
			System.out.println(el2.get(i).findElement(By.tagName("img")).getAttribute("src"));
//			img.add(el2.get(i).findElement(By.tagName("img")));
			jsonImg.put(i, el2.get(i).findElement(By.tagName("img")).getAttribute("src"));
			System.out.println("inserted");
		}
		
    	//드라이버 종료
    	try {
			if(driver != null) {
			driver.close();
			driver.quit();
			}//end if
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}

		PrintWriter out = resp.getWriter();
		out.println(jsonImg.toJSONString());
		

		return null;
	}

}
