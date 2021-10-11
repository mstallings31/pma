// For a pie chart
var myPieChart = new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
    data: {
        labels: ['January', 'February', 'March'],
        datasets: [{
            label: 'My First dataset',
            backgroundColor: ["#3e95cd", "#8e5ea2", "#3cba9f"],
            borderColor: 'rgb(255,99,132)',
            data: [5, 10, 5]
        }]
    },
    options: {}
});