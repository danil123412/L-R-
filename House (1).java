package ru.rsreu.gr945;

public class House {
    private int id;
    private int number;
    private float square;
    private int floor;
    private int rooms;
    private String street;
    private int lifetime;
    private Type type;
    private enum Type {Одноэтажное,
                        Двухэтажное,
                        Многоэтажное}

    House(){
        this.id = 0;
        this.number = 1;
        this.square = 30.0f;
        this.floor = 1;
        this.rooms  = 1;
        this.street =  "undefined";
        this.lifetime = 10;
        this.type = Type.Одноэтажное;
    }

    House(int id, int number)
    {
        this();
        this.id = id;
        this.number = number;

    }

    House(int id, int number, String street){
       this(id, number);
       this.street = street;
    }

    House(int id, int number, float square, int floor, int rooms, String street, int lifetime, Type type){
        this(id, number, street);
        this.square = square;
        this.floor =  floor;
        this.rooms = rooms;
        this.street = street;
        this.lifetime = lifetime;
        this.type = type;
    }

    int getId(){
        return this.id;
    }

    int getNumber(){
        return this.number;
    }

    float getSquare(){
        return this.square;
    }

    int getFloor(){
        return this.floor;
    }

    int getRooms(){
        return this.rooms;
    }

    String getStreet(){
        return this.street;
    }

    int getLifetime(){
        return this.lifetime;
    }

    Type getType(){
        return this.type;
    }

    void setId(int id){
        this.id = id;
    }

    void setNumber(int number){
        this.number = number;
    }

    void setSquare(float square){
        this.square = square;
    }

    void setFloor(int floor){
        this.floor = floor;
    }

    void setRooms(int rooms){
        this.rooms = rooms;
    }

    void setStreet(String street){
        this.street = street;
    }

    void setLifeTime(int lifetime){
        this.lifetime = lifetime;
    }

    void setType(Type type){
        this.type = type;
    }
}
