package mongotest.mongotest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MavenTest extends TestCase{

	public MavenTest( String testName )
    {
        super( testName );
    }
	public static Test suite()
    {
        return new TestSuite( MavenTest.class );
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
