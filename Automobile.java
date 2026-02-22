public class Automobile {
    // Private member variables for encapsulation
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;

    // 1. Constructor: Initializes the vehicle attributes
    public Automobile(String make, String model, String color, int year) {
        this.autoMake = make;
        this.autoModel = model;
        this.autoColor = color;
        this.autoYear = year;
    }

    // 2. AddVehicle: Updates the vehicle information
    public String addVehicle(String make, String model, String color, int year) {
        try {
            this.autoMake = make;
            this.autoModel = model;
            this.autoColor = color;
            this.autoYear = year;
            return "Vehicle added successfully";
        } catch (Exception e) {
            return "Error: Could not add vehicle";
        }
    }

    // 3. RemoveVehicle: Clears data if input matches stored record
    public String removeVehicle(String make, String model, String color, int year) {
        if (make.equals(this.autoMake) && model.equals(this.autoModel) && 
            color.equals(this.autoColor) && year == this.autoYear) {
            
            this.autoMake = null;
            this.autoModel = null;
            this.autoColor = null;
            this.autoYear = 0;
            return "Vehicle removed successfully";
        } else {
            return "Error: Vehicle details do not match stored record";
        }
    }

    // 4. UpdateVehicle: Modifies existing attributes
    public String updateVehicle(String make, String model, String color, int year) {
        if (make != null && !make.isEmpty() && model != null && !model.isEmpty()) {
            this.autoMake = make;
            this.autoModel = model;
            this.autoColor = color;
            this.autoYear = year;
            return "Vehicle updated successfully";
        }
        return "Error: Invalid update data";
    }

    // 5. ListVehicle: Returns the current state as a String array
    public String[] listVehicle() {
        return new String[] {
            "Make: " + autoMake, 
            "Model: " + autoModel, 
            "Color: " + autoColor, 
            "Year: " + autoYear
        };
    }
}