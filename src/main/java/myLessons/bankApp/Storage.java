package myLessons.bankApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private final Map<Client,Double> clients = new HashMap<>();

    public void addClients(Client client){
        clients.put(client,client.getBalance());
    }

    //Выводят всех клиентов у которых определенный статус карты
    public void getAllClientsWithStatus(boolean status){
        for (Client client : clients.keySet()){
            if (client.getBankCard().isStatus() == status){
                System.out.println("Client : " + client.getName() + ", Card status: " + status);
            }
        }
    }

    //Группируют по балансу у кого больше или меньше какой-то суммы
    public Map<Double,List<Client>> getClientsGroupedByBalanceMore(double balance){
        return clients.entrySet().stream()
                .filter(entry -> entry.getValue() > balance)
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
    }
    public Map<Double,List<Client>> getClientsGroupedByBalanceLess(double balance){
        return clients.entrySet().stream()
                .filter(c -> c.getValue() < balance) //3000€
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
    }

    //Средний баланс по клиентам
    public double getAverageBalance(){
        return clients.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    //Выводят только номера карт всех клиентов в формате имя номер
    public void printClientNamesAndCardNumbers(){
        for (Map.Entry<Client,Double> entry : clients.entrySet()){
            Client client = entry.getKey();
            double cardNumber = entry.getValue();
            System.out.println(client.getName() + " " + cardNumber);
        }
    }

    //Выводят всех клиентов в у кого закончился срок действия карт

    //Сортируют по балансу

    //Группируют у кого закончился срок карт, а у кого не


}
