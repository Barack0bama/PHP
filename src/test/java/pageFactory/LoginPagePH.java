package pageFactory;
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPagePH {

		WebDriver driver;

		public LoginPagePH(WebDriver driver) { // constructor
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//*[@name='username']")
		private WebElement username;

		@FindBy(how = How.XPATH, using = "//*[@name='password']")
		private WebElement password;
		
		@FindBy(how = How.XPATH, using = "//*[@class='dropdown-item active tr']")
		private WebElement accountBtn;
		
		@FindBy(how = How.XPATH, using = "//*[@title = 'home']")
		private WebElement homeBtn;


		public WebElement getHomeBtn() {
			return homeBtn;
		}

		public void setHomeBtn(WebElement homeBtn) {
			this.homeBtn = homeBtn;
		}

		public WebElement getAccountBtn() {
			return accountBtn;
		}

		public void setAccountBtn(WebElement accountBtn) {
			this.accountBtn = accountBtn;
		}

		public WebElement getUsername() {
			return username;
		}

		public void setUsername(WebElement username) {
			this.username = username;
		}

		public WebElement getPassword() {
			return password;
		}

		public void setPassword(WebElement password) {
			this.password = password;
		}


}
