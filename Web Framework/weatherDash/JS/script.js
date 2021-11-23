document.getElementById("searc").addEventListener('click', function () {
    var input1 = document.getElementById("sea").value;
    // For Testing Purpose
    console.log(input1);
    // The Fetch API is a modern interface that allows you to make HTTP requests to servers from web browsers.

    // The fetch() requires only one parameter which is the URL of the resource that you want to fetch:
    fetch("https://api.openweathermap.org/data/2.5/weather?q=" + input1 + "&appid=738c4af429c799eea7e9637ce54896b2")

    // The fetch() method returns a Promise so you can use the then() and catch() methods to handle it:
        .then(response => response.json())
    
    // When the request completes, the resource is available. At this time, the promise will resolve into a Response object.
    
    // A Promise is a JavaScript object that links producing code and consuming code
        .then(data => {
            var Tem = Math.floor(data['main']['temp'] - 273);
            var Feel = Math.floor(data['main']['feels_like'] - 273);
            var Hum = data['main']['humidity'];
            var Pres = data['main']['pressure'];
            var visi = data['visibility'];
            document.getElementById("city").innerHTML = input1+ " Weather";
            document.getElementById("Tem").innerHTML =  " Temperature : " + Tem;
            document.getElementById("Feel").innerHTML = "Feels Like : " +Feel;
            document.getElementById("Hum").innerHTML =  " Humidity : " + Hum;
            document.getElementById("Pres").innerHTML = " Pressure : " + Pres;
            document.getElementById("Visi").innerHTML = " Visibility : " + visi;
            document.getElementById("cont").style.display = "block";
        })
        .catch(err => alert("Wrong city name"))
})