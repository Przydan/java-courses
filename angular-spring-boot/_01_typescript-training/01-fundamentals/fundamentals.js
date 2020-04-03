console.log("start");
console.log("################################################");
console.log("||=--> Hello world");
console.log("Hello world");
console.log("New lang ! " + "time to code");
console.log("################################################");
console.log("||=--> Variables");
var found = true;
var grade = 838.23;
var firstName = "Mario";
var lastName = "Spaghetti";
console.log(found);
console.log(grade);
console.log("Hi " + firstName + " " + lastName + ", your number is: " + grade);
console.log("Hi " + firstName + " " + lastName + " your grade equals " + grade);
console.log("################################################");
console.log("||=--> Arrays and loops");
var reviews = [5, 3, 3, 2, 2, 5, 2, 4, 4];
var sportsOne = ["Tennis", "Golf", "Hockey", "Cricket", "Swimming"];
for (var i = 0; i < 5; i++) {
    console.log("- " + i + ". basic for loop test");
}
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    console.log("- " + i + ". review score:  " + reviews[i]);
    total += reviews[i];
}
var average = total / reviews.length;
console.log("Reviews score average is: " + average);
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var tempSport = sportsOne_1[_i];
    console.log(tempSport == "Golf" ? tempSport + "<< my favorite" : tempSport);
}
sportsOne.push("Baseball");
sportsOne.forEach(function (sport) { return console.log("- forEach method " + sport); });
console.log("################################################");
console.log("end");
