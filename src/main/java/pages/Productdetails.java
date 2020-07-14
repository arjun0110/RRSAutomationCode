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
	
	@FindBy(how=How.XPATH,using="//*[@src='/rrs/kids/images/icons/stars/star-rating-sml-4.5.png']")
	private WebElement reviewstar;
	
	public Productdetails verifyreviewinpdp() 
	{
		highLighterMethod(driver, reviewstar);
		verifyDisplayed(reviewstar);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-swatch-selection,'Black')]")
	private WebElement garmincolor;
	
	public Productdetails choosegarmincolor() 
	{
		click(garmincolor);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@class='pr-snippet-link pr-snippet-reviewlink']")
	private WebElement reviewstars;
	
	public Productdetails verifyreviewinpdpkid() 
	{
		click(reviewstars);
		highLighterMethod(driver, reviewskid);
		verifyDisplayed(reviewskid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='item-number prod_itemid']")
	private WebElement item;
	
	public Productdetails verifyitem() 
	{
		highLighterMethod(driver, item);
		verifyDisplayed(item);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[@class='prod_detail_reg_price3 prod_reg_title']")
	private WebElement msrpkid;
	
	public Productdetails verifymsrpkid() 
	{
		highLighterMethod(driver, msrpkid);
		verifyDisplayed(msrpkid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='prod_detail_sale_price prod_reg_title']")
	private WebElement nowkid;
	
	public Productdetails verifynowprice() 
	{
		highLighterMethod(driver, nowkid);
		verifyDisplayed(nowkid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='prod_detail_vip_price']")
	private WebElement vippricekid;
	
	public Productdetails verifyvipprice() 
	{
		highLighterMethod(driver, vippricekid);
		verifyDisplayed(vippricekid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='selQtyTitle']")
	private WebElement qty;
	
	public Productdetails verifyquantity() 
	{
		highLighterMethod(driver, qty);
		verifyDisplayed(qty);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='selQtyTitle']")
	private WebElement qtydp;
	
	public Productdetails verifyquantitydropdown() 
	{
		
		click(qtydp);
		click(qtydp);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[@id='s7zoomviewer_div_fullScreenButton']")
	private WebElement max;
	
	public Productdetails maxandminimage() 
	{
		
		click(max);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pressescape();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='grp_1Tab']")
	private WebElement description;
	
	public Productdetails verifydescription() 
	{
		try {
			pageScrolltwice();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		highLighterMethod(driver, description);
		verifyDisplayed(description);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id='grp_2Tab']")
	private WebElement reviewskid;
	
	public Productdetails verifyreviewskids() 
	{
		click(reviewskid);
		highLighterMethod(driver, reviewskid);
		verifyDisplayed(reviewskid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='grp_3Tab']")
	private WebElement videoskid;
	
	public Productdetails verifyvideoskids() 
	{
		click(videoskid);
		highLighterMethod(driver, videoskid);
		verifyDisplayed(videoskid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='box-wrap']/h3")
	private WebElement recommended;
	
	public Productdetails verifyrecommended() 
	{
		
		highLighterMethod(driver, recommended);
		verifyDisplayed(recommended);
		return this;
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
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'Black/Red')]")
	private WebElement colorofsecondkid;
	public Productdetails choosecolorforsecondproductkid() 
	{
		highLighterMethod(driver, colorofsecondkid);
		click(colorofsecondkid);
		
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
	
	@FindBy(how=How.XPATH,using="//*[@class='recomendation__number_text']")
	private WebElement reviews;
	
	public Productdetails reviewsTab() 
	{
		
		
click(reviews);

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
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[(@name='S')]")
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
	
	@FindBy(how=How.XPATH,using="//*[(@name='1.5Y')]")
	private WebElement sizekid;
	
	public Productdetails choosesizekid() 
	{
		highLighterMethod(driver, sizekid);
		click(sizekid);
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	@FindBy(how=How.XPATH,using="//*[@id='shoppingCartSummaryNew']")
	private WebElement viewCart;
	public Productdetails addtocart() 
	{
		highLighterMethod(driver, addtocartbutton);
		click(addtocartbutton);	
		
		
		click(viewCart);
		
		return this;
	}
	
	public Productdetails addtocartflycart() 
	{
		highLighterMethod(driver, addtocartbutton);
		click(addtocartbutton);	
		
		
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='product-title']")
	private WebElement prodTitle;
	
	@FindBy(how=How.XPATH,using="//*[@class='product-price-info']")
	private WebElement prodprice;
	
	@FindBy(how=How.XPATH,using="//*[@id='mini-viewCart-btn']")
	private WebElement viewcart;
	
	@FindBy(how=How.XPATH,using="//*[@id='mini-checkout-btn']")
	private WebElement checkout;
	
	@FindBy(how=How.XPATH,using="//*[@class='rplus-link']")
	private WebElement checkoutbutton;
	
	public Productdetails verifyflycart() 
	{
		highLighterMethod(driver, prodTitle);
		verifyDisplayed(prodTitle);	
		
		highLighterMethod(driver, prodprice);
		verifyDisplayed(prodprice);	
		highLighterMethod(driver, viewcart);
		verifyDisplayed(viewcart);	
		highLighterMethod(driver, checkout);
		verifyDisplayed(checkout);	
		
		
		
		
		return this;
	}
	
	public Productdetails clickviewCart() 
	{
		highLighterMethod(driver, viewcart);
		click(viewcart);	
		
		
		
		
		return this;
	}
	
	public OrderSummary clickcheckoutcart() 
	{
		highLighterMethod(driver, checkout);
		click(checkout);	
		click(checkoutbutton);
		highLighterMethod(driver, carttitle);
		verifyDisplayed(carttitle);	
		
		
		
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='cart-title']")
	private WebElement carttitle;
	
	public Productdetails verifycarttitle() 
	{
		highLighterMethod(driver, carttitle);
		verifyDisplayed(carttitle);	
		
		
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id='shoppingCartSummaryNew']")
	private WebElement viewCarts;
	public ViewCart addtocartguest() 
	{
		highLighterMethod(driver, addtocartbutton);
		click(addtocartbutton);	
		
		
		click(viewCarts);
		
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='addToCartLinkKids']")
	private WebElement addtocartbuttonkids;
	public Productdetails addtocartkids() 
	{
		highLighterMethod(driver, addtocartbuttonkids);
		click(addtocartbuttonkids);	
		
		click(viewCarts);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_preorder_inventory')]")
	private WebElement addtocarterrormessage;
	public Productdetails addtocartIncorrectmessage() 
	{
		verifyDisplayed(addtocarterrormessage);
		
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='checkout_guest checkout-guest-wrap-btn']")
	private WebElement guest;
	
	public ViewCart clickGuestbutton() 
	{
		
		click(guest);
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'viewCartLink')]")
	private WebElement cart;
	@FindBy(how=How.XPATH,using="//*[@alt='Submit Order']")
	private WebElement submitOrder;
	public ViewCart viewCart() 
	{
		
		
		//click(cart);
		click(submitOrder);
		
		
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'checkout-button')]")
	private WebElement checout;
	@FindBy(how=How.XPATH,using="//*[@id='clickButton']")
	private WebElement submit;
	public ViewCart viewCartforkid() 
	{
		
		
		click(checout);
		click(submit);
		
		
		return new ViewCart();
	}
	@FindBy(how=How.XPATH,using="//*[contains(@class,'checkout_guest checkout-guest-wrap-btn')]")
	private WebElement guests;
	public ViewCart guestchecout() 
	{
		
		
		//click(cart);
		click(guests);
		
		
		return new ViewCart();
	}

	@FindBy(how=How.XPATH,using="//*[contains(@src,'/rrs/img/checkout/viewcartpop_btn.gif')]")
	private WebElement cartforvip;
	public ViewCart viewCartforvip() 
	{
		
		
		click(cartforvip);
		
		
		
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
	
	@FindBy(how=How.XPATH,using="//*[@name='Coral/White']")
	private WebElement colorshoe;
	public Productdetails choosecolorofshoe() 
	{
		highLighterMethod(driver, colorshoe);
		click(colorshoe);
		
		return this;
	}	
	
	@FindBy(how=How.XPATH,using="//*[@name='1Y']")
	private WebElement sizeshoe;
	public Productdetails choosesizeofshoe() 
	{
		highLighterMethod(driver, sizeshoe);
		click(sizeshoe);
		
		return this;
	}	
}

