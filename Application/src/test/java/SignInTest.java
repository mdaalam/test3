import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTest extends FSBase{
//
    @Test
    public void testSignIn() throws InterruptedException {
        fsLogin();
    }
//
//    @Test
//    public void testSearch() throws InterruptedException, IOException {
//        fsSearch();
//        Assert.assertEquals(driver.getTitle(), "Nike | Final-Score");
//    }
//
//    @Test
//    public void testAutorizedUsersSearch() throws InterruptedException {
//        fsLogin();
//        fsSearch();
//    }
}
