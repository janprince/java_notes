package Practice;

class Phone{
    String color;
    String brand;
    int memory;
    int cam_pixel;

    Phone(String color, String brand, int memory, int cam_pixel ){
        this.color = color;
        this.brand = brand;
        this.memory = memory;
        this.cam_pixel =cam_pixel;
    }

    void get_features(){
        System.out.println(color + "\n" + brand + "\n" + memory + "\n" + cam_pixel);
    }
}
