var app = angular.module('optPrimeApp', []);

app.controller('optPrimeController', ['$scope', function($scope){
	var imageDir = './assets/sitePictures/';
	var imgList = [
		'1.jpg',
		'2.jpg',
		'3.jpg',
		'4.jpg'
	];
	$scope.linkToShow = imageDir + imgList[0];

	$scope.index = 0;

	$scope.previousClick = function previousClick(index) {
		$scope.index = $scope.index - 1;
		if ($scope.index < 0) {
			$scope.index = imgList.length - 1;
		}
		$scope.linkToShow = imageDir + imgList[$scope.index];		
	}

	$scope.nextClick = function nextClick(index) {
		$scope.index = $scope.index + 1;
		if ($scope.index > imgList.length - 1) {
			$scope.index = 0;
		}
		$scope.linkToShow = imageDir + imgList[$scope.index];		
	}
}]);