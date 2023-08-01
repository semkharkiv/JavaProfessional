package myLessons.autoTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Handler {
    private Developer developer;
    private Car car;

    //—проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина
    public  List<Developer> getDevelopersWithSportCar(List<Developer> developers) {
        return developers.stream().filter(developer -> developer.getSex() == 'M' && developer.getCar().isSport()).collect(Collectors.toList());
    }

    //—группировать по полу все машины. те у мужчин такие то у женщин такие то
    public Map<Character,List<Car>> getCarBySex(List<Developer> developers){
        return developers.stream()
                .collect(Collectors.groupingBy(Developer::getSex,Collectors.mapping(Developer::getCar,Collectors.toList())));
    }

    //—Переводить в мапу ключ-девелопер а значение максимальная скорость авто
    public Map<Developer,Integer> getDeveloperAndMaxCarSpeed(List<Developer> developers){
        return developers.stream().collect(Collectors.toMap(developer->developer,developer->developer.getCar().getMaxSpeed(),(existing,replacement)->existing,HashMap::new));
    }
}
