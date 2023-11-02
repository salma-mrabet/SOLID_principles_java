package exercise_refactored;

public class CarService {

	private CarRepository carRepository;

	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public Car getBestCar() {
		Car bestCar = null;
		for (Car car : carRepository.getAllCars()) {
			if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
				bestCar = car;
			}
		}
		return bestCar;
	}

	public String getCarsNames() {
		StringBuilder sb = new StringBuilder();
		for (Car car : carRepository.getAllCars()) {
			sb.append(car.getBrand());
			sb.append(" ");
			sb.append(car.getModel());
			sb.append(", ");
		}
		return sb.substring(0, sb.length() - 2);
	}

}
