angular.module('TestAngular', ['ngRoute']).config(function($routeProvider) {
              
              $routeProvider.when('/', {
                             templateUrl: 'partial/login.html',
                             controller: 'loginController'
              }).otherwise({
                             redirectTo: '/'
              });
              
});
