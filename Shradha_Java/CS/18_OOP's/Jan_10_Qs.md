1. The private and protected modifiers are not allowed in front of the class
2. If i have a a parent reference then the child obj can be assigned to parent reference
 - parent reference = child obj  (assign  not equal)
    - that means
    - Car c = new Car()
    - Vehicle v = new Vehicle()
    - Vehicle v = new Car()   // it will also true✅
    - ❌ Car c = new Vehicle()   // (acc to me car is child of vechicle the parent)
3. Aggregation is multiple classes inside one class