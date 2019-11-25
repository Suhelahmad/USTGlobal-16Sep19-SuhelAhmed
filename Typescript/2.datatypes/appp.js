// ways of declaring variables in typescript
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = 'suhel';
console.log('Name is =', myName, typeof myName);
var age;
console.log(age, typeof age);
var mobilenumber = 5454545454;
console.log(mobilenumber, typeof mobilenumber);
var address;
address = 'kittur';
console.log(address, typeof address);
var calage = function () {
    console.log("age is 23");
};
calage();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person("suhel", 23);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollno) {
        var _this = _super.call(this, name, age) || this;
        _this.rollno = rollno;
        return _this;
    }
    return student;
}(Person));
var student1 = new student('suhel', 21, 222);
console.log(student1);
