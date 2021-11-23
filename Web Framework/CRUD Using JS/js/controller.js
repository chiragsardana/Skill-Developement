window.addEventListener("load", bindEvents);
function bindEvents(){
    document.querySelector("#add").addEventListener('click', app.Add());
}



var app = new function() {

    // We select our element where we want to display data (“#details”).
    this.el = document.getElementById('details');

    // our data in a simple array.
    this.details = [];

    // the counter in a the function “Count()”.
    this.Count = function(data) {
        var el   = document.getElementById('counter');
        var name = 'country';

        if (data) {
            if (data > 1) {
                name = 'details';
            }
            el.innerHTML = data + ' ' + name ;
        } else {
            el.innerHTML = 'No ' + name;
        }
    };

    // With these 3 informations, we can start our CRUD method in a new function “FetchAll()” .
    this.FetchAll = function() {
        var data = '';

        if (this.details.length > 0) {
            for (i = 0; i < this.details.length; i++) {
            data += '<tr>';
            data += '<td>' + this.details[i] + '</td>';
            data += '<td><button onclick="app.Edit(' + i + ')">Edit</button></td>';
            data += '<td><button onclick="app.Delete(' + i + ')">Delete</button></td>';
            data += '</tr>';
            }
        }

        this.Count(this.details.length);
        return this.el.innerHTML = data;
    };

    this.Add = function () {

        el = document.getElementById('add-name');
        
        // Get the value
        var detail = new Detail(el.value);

        if (detail.country) {
            // Add the new value
            this.details.push(detail.country.trim());
            // Reset input value
            el.value = '';
            // Dislay the new list
            this.FetchAll();
        }
    };

    this.Edit = function (item) {
        var el = document.getElementById('edit-name');
        // Display value in the field
        el.value = this.details[item];
        // Display fields
        document.getElementById('spoiler').style.display = 'block';
        self = this;

        document.getElementById('saveEdit').onsubmit = function() {
            // Get value
            var country = el.value;

            if (country) {
                // Edit value
                self.details.splice(item, 1, country.trim());
                // Display the new list
                self.FetchAll();
                // Hide fields
                CloseInput();
            }
        }
    };
    // delete a row.
    this.Delete = function (item) {
        // Delete the current row
        this.details.splice(item, 1);
        // Display the new list
        this.FetchAll();
    };

}


function CloseInput() {
    document.getElementById('spoiler').style.display = 'none';
}