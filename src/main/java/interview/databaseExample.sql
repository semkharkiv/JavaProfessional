CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    Username VARCHAR(50)
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    UserID INT,
    ProductName VARCHAR(100),
    Amount DECIMAL(10, 2),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);

1. выбрать имена всех пользователей которые сделали больше 3 заказов
2. выбрать имена пользователей и общую сумма их заказов, у которых общая сумма заказов превышает 1000

1.
select u.Username
from Users u
join (
select UserID,count(*) as OrderCount
from Orders
group by UserID
having OrderCount > 3
) o on u.UserID = o.UserID;

2.
select u.Username, sum(o.Amount) as TotalAmount
from Users u
join Orders o on u.UserID = o.UserID
group by u.UserID, u.Username
having TotalAmount > 1000;