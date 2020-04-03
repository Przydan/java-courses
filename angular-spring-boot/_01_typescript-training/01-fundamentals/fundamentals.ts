console.log("start");
console.log("################################################");
console.log("||=--> Hello world");

console.log("Hello world");
console.log("New lang ! " + "time to code");

console.log("################################################");
console.log("||=--> Variables");

let found: boolean = true;
let grade: number = 838.23;
let firstName: string = "Mario";
let lastName: string = "Spaghetti";

console.log(found);
console.log(grade);
console.log("Hi " + firstName + " " + lastName + ", your number is: " + grade);

console.log(`Hi ${firstName} ${lastName} your grade equals ${grade}`);

console.log("################################################");
console.log("||=--> Arrays and loops");
let reviews: number[] = [5,3,3,2,2,5,2,4,4];
let sportsOne: string[] = ["Tennis","Golf","Hockey","Cricket","Swimming"];

for (let i = 0; i < 5; i++) {
    console.log(`- ${i}. basic for loop test`);
}

let total: number = 0;
for (let i = 0; i < reviews.length; i++) {
    console.log(`- ${i}. review score:  ${reviews[i]}`);
    total += reviews[i];
}
let average: number = total / reviews.length;
console.log(`Reviews score average is: ${average}`);

for (let tempSport of sportsOne) {
    console.log(tempSport == "Golf" ? tempSport + "<< my favorite" : tempSport);
}

sportsOne.push("Baseball");

sportsOne.forEach(sport => console.log(`- forEach method ${sport}`));

console.log("################################################");
console.log("end");
