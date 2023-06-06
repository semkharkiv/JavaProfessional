package basicToday._05_06_23.mockito;

import java.time.LocalDate;

public class CurrentYearProviderImpl implements CurrentYearProvider{
    @Override
    public int getYear() {
        return LocalDate.now().getYear();
    }
}
