
import 'package:flutter/cupertino.dart';
import 'dart:convert';
import 'package:flutter/material.dart';
import '../models/personname.dart';
import 'package:http/http.dart' as http;


class Provider_Demo with ChangeNotifier{

  Provider_Demo(){
    fetchTasks();
  }

  List<PersonName> _myList = [];
  
  List<PersonName> get myList {
    return [..._myList];
  }

  fetchTasks() async{
    const url = 'http://127.0.0.1:8000/views/';
    final response = await http.get(Uri.parse(url)); //Network request

    if(response == 200) { /// if response is success
      var data = json.decode(response.body); /// convert network data to dart type

      _myList = data.map<PersonName>((json)=> PersonName.fromJson(json)).toList();

    }
  }
}