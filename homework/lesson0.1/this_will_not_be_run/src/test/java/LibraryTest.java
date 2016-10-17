import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class LibraryTest {
  @Test
  public void test_positive_case_namesurname() {
      Library classUnderTest = new Library();
      assertThat(classUnderTest.someLibraryMethod(true), is(true));
  }
}
