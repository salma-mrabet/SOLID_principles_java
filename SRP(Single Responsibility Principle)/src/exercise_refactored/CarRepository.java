package exercise_refactored;

import java.util.List;

public class CarRepository {

	private List<Car> carsDb;

	public CarRepository(List<Car> carsDb) {
		this.carsDb = carsDb;
	}

	public Car getFromDb(String carId) {
		for (Car car : carsDb) {
			if (car.getId().equals(carId)) {
				return car;
			}
		}
		return null;
	}

	public void insertCar(Car car) {
		carsDb.add(car);
	}

	public void updateCar(Car car) {
		for (int i = 0; i < carsDb.size(); i++) {
			if (carsDb.get(i).getId().equals(car.getId())) {
				carsDb.set(i, car);
				return;
			}
		}
	}

	public void deleteCar(Car car) {
		carsDb.remove(car);
	}

	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return carsDb;
	}

}
