const msg = new Promise(function(resolve,reject)

{
    if(10>20)
    {
        resolve([{
            name: 'BillGates',
            age : 67
        },{
            name: 'mark zuckerbag',
            age : 40
        },{
            name: 'suhel',
            age: 23
        
        }])
    }
    else
    {
        reject('failed');
    }
})

msg.then(function(msg)
{
    console.log('Message Status: ',msg);
}).catch(function(error)
{
    console.log('Message Status : Failed');
})
