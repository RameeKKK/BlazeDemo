import org.junit.Before;
import org.junit.BeforeClass;
import org.sample.BaseClass;

public class Automate extends BaseClass {
	@BeforeClass
	public static void bef(){
	getDriver() ;
	}
	@Before
	public  void be() {
		getUrl("https://www.amazon.in/");
	}
	
}

