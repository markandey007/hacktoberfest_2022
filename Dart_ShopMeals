import 'package:flutter/material.dart';
import 'package:shopmeals/screens/category_screen.dart';
import 'package:shopmeals/screens/category_meals_screen.dart';

void main(List<String> args) {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key key}) : super(key: key);
  // static const routeName = '/category-meals';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Meals App",
      theme: ThemeData(
        primarySwatch: Colors.pink,
        accentColor: Colors.amber,
        canvasColor: const Color.fromRGBO(255, 254, 229, 1),
        fontFamily: 'RaleWay',
      ),
      home: CategoriesScreen(),
      routes: {'/category-meals': ((ctx) => CategoryMealsScreen())},
    );
  }
}
