console.log('window  object',window);
console.log('This Keyword',this);

console.log(this===window);

// window.alert("Welcome to Javascript class");

// alert("Welcome to UST Global and TestYantra");


// let confirmDelete = confirm('Want to Exit...?')

/// console.log("Confirm Delete",confirmDelete);
 
// let username = prompt('What  is your name');
// console.log('UserName = ', username);

const person = {
                    firstname : 'Alia',
                    age: 69,
                    lastname: 'kapoor',
                    getName : function(){
                        console.log('This Keyword',this);
                        return this.firstname + ' ' + this.lastname
                    }
                }

                let fullName = person.getName()
                console.log('Full Name',fullName);
                    

