package search;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Roger on 20.10.2015.
 */
public class SearchEngineTest {

    SearchEngine instance;

    public SearchEngineTest(){}

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testSearch(){
        String[] out = {"hei","test","kjøttdeig","repo","løk"};
        String[] out2 = {"storm","fisk","kylling"};

        UrlPageReader repo = mock(UrlPageReader.class);

        when(repo.readPage("Bjarne.com")).thenReturn(out);
        when(repo.readPage("Mockingbird.com")).thenReturn(out2);

        instance = new SearchEngine(repo);
        instance.indexPage("Bjarne.com");
        instance.indexPage("Mockingbird.com");

        assertEquals("Bjarne.com", instance.search("test").get(0));
        assertEquals("Mockingbird.com", instance.search("kylling").get(0));

        assertNull(instance.search("hgjhgjhgjh"));
    }

}