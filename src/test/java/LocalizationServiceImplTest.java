import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LocalizationServiceImplTest {

    @Mock
    private LocalizationService localizationService;

    private LocalizationServiceImpl localizationServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        localizationServiceImpl = new LocalizationServiceImpl();
    }

    @Test
    public void testLocale_Russia() {
        String result = localizationServiceImpl.locale(Country.RUSSIA);
        assertEquals("Добро пожаловать", result);
    }

    @Test
    public void testLocale_USA() {
        String result = localizationServiceImpl.locale(Country.USA);
        assertEquals("Welcome", result);
    }


}