


class PersonName{
  final String firstName, lastName; //Stores person's name
  PersonName({required this.firstName, required this.lastName}); /// OVerloading constructor


  /// assigned the name from the site by translating json to this
  factory PersonName.fromJson(Map<String, dynamic> json){
    return PersonName(
      firstName : json['firstName'],
      lastName : json['lastName'],
    );
  }
}