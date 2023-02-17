// This is angular controller for homepage

var webapp = angular.module('webappZtoA', []);

webapp.controller('NullifyControllerZtoA', function ($scope, $http) {

    $scope.loadWebsiteZtoA = function() {
        $http.get("/sortZA")
            .success(function(data){
                $scope.sitelist = data;
            });
    }

    $scope.searchWebsites = function() {
        $scope.searchedfor = true;
        $http.get("/search/" + $scope.websitesearch)
            .success(function(data){
                $scope.foundwebsite = data;
            });
    }

    $scope.sortAZ = function() {
        $http.get("/sortAZ/")
            .success(function(data){
                $scope.sitelistAZ = data;
            });
    }

    $scope.sortZA = function() {
        $http.get("/sortZA/")
            .success(function(data){
                $scope.sitelistZA = data;
            });
    }

    $scope.showCanDelete = function() {
        $http.get("/candelete/")
            .success(function(data){
                $scope.canBeDeleted = data;
            });
    }


// this is the add website button
    $scope.addWebsite = function() {
        // add the rest of the fields
        $http.post("/cs480/" + $scope.websitenameinput + "?domain=" + $scope.domainnameinput + "&settings=" + $scope.changepasswordpageinput + "&changepassword=" + $scope.deleteaccountpageinput + "&deleteaccount=" + $scope.notesinput + "&notes") //  + $scope.imageinput + "&image"
            .success(function(data){
                $scope.loadUsers();
            });
    }

    $scope.addFolder = function() {
        $http.get("/addfolder/" + $scope.addedfoldername)
            .success(function(data){
                $scope.folderadded = data;
                $scope.getFolderNames();
            });
    }

    $scope.getFolder = function() {
        $scope.gottenfoldername = foldername;
        $http.get("/getfolder/" + $scope.foldername)
            .success(function(data){
                $scope.sitelist = data;
            });
        return $scope.sitelist;
    }

    $scope.getFolderNames = function() {
        $http.get("/getfoldernames/")
            .success(function(data){
                $scope.listoffolders = data;
            });
    }

    $scope.addItem = function(item) {
        var foldername = item.folder;
        var websitename = item.websitename;
        $http.get("/additem/" + foldername + "/" + websitename)
            .success(function(data){
                alert(websitename + " added successfully to folder " + foldername);
            });
    }

    $scope.getFolderNames();
    $scope.loadWebsiteZtoA();

});