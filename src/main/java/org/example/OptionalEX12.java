package org.example;

import java.util.*;

class Car{
    private String carName;
    private double year;
    private String country;

    public Car(String carName, double year, String country) {
        this.carName = carName;
        this.year = year;
        this.country = country;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
//class CarDataBase{
//    public static Optional<List<Car>> getCarList(){
//        Car car=new Car("Benz",2016,"Germany");
//        Car car1=new Car("Roll Royce",2015,"Russia");
//        Car car2=new Car("BMW",2017,null);
//        Car car3=new Car("Maruti",2014,"");
//        Car car4=new Car("Thar",2016,"Germany");
//        List<Car>carList2=Arrays.asList(car,car1,car2,car3,car4);
//        return Optional.ofNullable(carList2);
//
//
//}
//}
public class OptionalEX12 {
    public static List<Car>getCarList(){
        List<Car>carList=new ArrayList<>();
        carList.add(new Car("Benz",2016,"Germany"));
        carList.add(new Car("Roll Royce",2015,"Russia"));
        carList.add(new Car("BMW",2017,null));
        carList.add(new Car("Maruti",2014,""));
        carList.add(new Car("Benz",2016,"Germany"));
        carList.add(new Car("Benz",2016,"Germany"));
        carList.add(new Car("Benz",2016,"Germany"));
        carList.add(new Car("Benz",2016,"Germany"));
        return carList;

    }
    public static void main(String[] args) {
       // Optional<List<Car>> carList = CarDataBase.getCarList();
        List<Car> carList1 = getCarList();
        for (Car car : carList1) {
            if (car.getCountry() != null && car.getCountry().equalsIgnoreCase("Germany")){
                System.out.println(car.getCarName() + "car is from Germany");
        }
    }
//        Optional<Car>optionalCar=getCarList().stream().filter(car -> car.getCountry()!=null && car.getCountry().equalsIgnoreCase("Germany")).findFirst();
//        System.out.println(optionalCar);

        getCarList().stream().forEach(car -> System.out.println(car.getCarName()));
//        Optional<Object>objectOptional=Optional.ofNullable(carList1);
//        System.out.println(objectOptional);
//

    }
}

