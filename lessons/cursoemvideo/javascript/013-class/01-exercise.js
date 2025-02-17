let friend = {name: "Matheus",
 genre: "M",
 weight: 89,
 getheavier(p=0){
    console.log("Got heavier!")
    this.weight += p
}}

friend.getheavier(2)
console.log(`${friend.name} weighs ${friend.weight}kgs.`)