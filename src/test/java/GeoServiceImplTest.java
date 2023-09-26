import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeoServiceImplTest {

    @Mock
    private GeoService geoService;

    private GeoServiceImpl geoServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        geoServiceImpl = new GeoServiceImpl();
    }

    @Test
    public void testByIp_RussianIP() {
        Location location = geoServiceImpl.byIp("172.0.32.11");
        assertEquals("Moscow", location.getCity());
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    public void testByIp_AmericanIP() {
        Location location = geoServiceImpl.byIp("96.44.183.149");
        assertEquals("New York", location.getCity());
        assertEquals(Country.USA, location.getCountry());
    }


}