

function teach() {
    try {
        console.log('teach start...');
        var tnr = "Nag";  // Moved to spl-memory on heap before context destroy
        setTimeout(function () { 
            console.log('after timeout...');
            //throw new Error('i hate .js');
            console.log(tnr+" back..");
        },5000);
        
        console.log('teach end.');
    } catch (e) {
        console.log('i caught '+e.message);
    }
}

teach();