package myLessons.autoTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class HandlerTest {
    @Mock
    private Developer mockDeveloper;
    @Mock
    private Car mockCar;

    @InjectMocks
    private Handler handler;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        handler = new Handler();
    }
    @Test
    void getDevelopersWithSportCar() {
        when(mockDeveloper.getSex()).thenReturn('M');
        when(mockCar.isSport()).thenReturn(true);
        when(mockDeveloper.getCar()).thenReturn(mockCar);

        List<Developer> developers = new ArrayList<>();
        developers.add(mockDeveloper);

        List<Developer> result = handler.getDevelopersWithSportCar(developers);

        assertEquals(1,result.size());

        verify(mockDeveloper).getCar();
    }

    @Test
    public void testGetDevelopersWithSportCar_NoSportCar() {
        when(mockDeveloper.getSex()).thenReturn('M');
        when(mockCar.isSport()).thenReturn(false);
        when(mockDeveloper.getCar()).thenReturn(mockCar);

        List<Developer> developers = new ArrayList<>();
        developers.add(mockDeveloper);


        List<Developer> result = handler.getDevelopersWithSportCar(developers);

        assertEquals(0, result.size());
    }

    @Test
    void getCarBySex() {
        when(mockDeveloper.getSex()).thenReturn('M');
        when(mockDeveloper.getCar()).thenReturn(mockCar);

        List<Developer> developers = new ArrayList<>();
        developers.add(mockDeveloper);

        Map<Character,List<Car>> result = handler.getCarBySex(developers);

        assertEquals(1,result.size());
    }

    @Test
    void getDeveloperAndMaxCarSpeed() {
    }
}