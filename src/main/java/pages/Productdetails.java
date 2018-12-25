package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Productdetails extends ProjectMethods{
	
	public Productdetails() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'product__name')]")
	private WebElement verifyproduct;
	
	
	public Productdetails verifyProduct() 
	{
		highLighterMethod(driver, verifyproduct);
		verifyDisplayed(verifyproduct);//*[contains(@id,'12366_img_url')]
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'smartGift')]")
	private WebElement giftlink;
	
	
	public giftlink clickgiftlink() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, giftlink);
		click(giftlink);
		newTabwithoutclose();
		return new giftlink();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'selSizeTitle')]")
	private WebElement yousize;
	
	public giftlink clickgiftlinks() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, giftlink);
		click(giftlink);
		try {
			pageScrollUp();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, yousize);
		return new giftlink();
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_reg_price3')]")
	private WebElement msrp;
	
	public Productdetails verifymsrp() 
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(msrp);
		highLighterMethod(driver, msrp);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_vip_price')]")
	private WebElement vip;
	
	public Productdetails verifyvip() 
	{
		
		verifyDisplayed(vip);
		highLighterMethod(driver, vip);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'get_this_price')]")
	private WebElement getthisprice;
	public Productdetails getthispricelink() 
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(vip);
		highLighterMethod(driver, getthisprice);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'sku__number')]")
	private WebElement itemid;
	public Productdetails itemid() 
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(itemid);
		highLighterMethod(driver, itemid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Color;013')]")
	private WebElement color;
	public Productdetails choosecolor() 
	{
		highLighterMethod(driver, color);
		click(color);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Color;098')]")
	private WebElement color2;
	public Productdetails chooseanothercolor() 
	{
		highLighterMethod(driver, color);
		click(color2);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Color;013')]")
	private WebElement colorofsecond;
	public Productdetails choosecolorforsecondproduct() 
	{
		highLighterMethod(driver, colorofsecond);
		click(colorofsecond);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@src,'https://s7ondemand1.scene7.com/is/image/roadrunnersports/RRL1135-056_SW')]")
	private WebElement colors;
	public Productdetails chooseacolor() 
	{
		
		highLighterMethod(driver, colors);
		click(color);
		FluentWait();
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@class='head']")
	private WebElement socialmedia;
	
	public Productdetails socialmedialinks() 
	{
		scrollBottom();
		highLighterMethod(driver, socialmedia);
		verifyDisplayed(socialmedia);
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_2Tab')]")
	private WebElement reviews;
	
	public Productdetails reviewsTab() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'marketing__title')]")
	private WebElement youlike;
	
	public Productdetails youmaysldolike() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(youlike);
		FluentWait();
		highLighterMethod(driver, youlike);
		verifyDisplayed(youlike);

		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_3Tab')]")
	private WebElement videos;
	
	public Productdetails videoTab() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(videos);
		FluentWait();
		highLighterMethod(driver, videos);
		verifyDisplayed(videos);

		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_4Tab')]")
	private WebElement needhelp;
	
	public Productdetails needHelp() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(needhelp);
		FluentWait();
		highLighterMethod(driver, needhelp);
		verifyDisplayed(needhelp);

		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'product_desc_content')]")
	private WebElement productDescription;
	
	public Productdetails productDetails() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, productDescription);
		verifyDisplayed(productDescription);
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Find us on Facebook')]")
	private WebElement fb;
	
	public Facebook fbnavigation() 
	{
	click(fb);
		
		return new Facebook();
	}
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'XS')]")
	private WebElement size;
	public Productdetails choosesize() 
	{
		highLighterMethod(driver, size);
		click(size);
		FluentWait();
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Click for a size chart')]")
	private WebElement sizechart;
	public Productdetails sizechart() 
	{
		highLighterMethod(driver, sizechart);
		click(sizechart);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'quantity')]")
	private WebElement quantity;
	public Productdetails quantity() 
	{
		try {
			pageScroll();
		} catch (AWTException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(quantity);	
		
		highLighterMethod(driver, quantity);
		
		
		return this;
	}

	@FindBy(how=How.XPATH,using="//*[contains(@id,'addToCartLink')]")
	private WebElement addtocartbutton;
	public Productdetails addtocart() 
	{
		highLighterMethod(driver, addtocartbutton);
		click(addtocartbutton);	
		
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_preorder_inventory')]")
	private WebElement addtocarterrormessage;
	public Productdetails addtocartIncorrectmessage() 
	{
		verifyDisplayed(addtocarterrormessage);
		
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'viewCartLink')]")
	private WebElement cart;
	public ViewCart viewCart() 
	{
		
		
		click(cart);
		
		
		
		return new ViewCart();
	}
	
	public OrderSummary viewCarts() 
	{
		click(cart);
		
		
		
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='smartGift']")
	private WebElement giftlinks;
	public ViewCart viewgift() 
	{
		
		
		verifyDisplayed(giftlinks);
		highLighterMethod(driver, giftlinks);
		
		
		
		return new ViewCart();
	}
	
	
}

