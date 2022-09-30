import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/foundation/key.dart';
import 'package:flutter/src/widgets/container.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:shopmeals/model/meal.dart';

class MealItem extends StatelessWidget {
  final String imageUrl;
  final String title;
  final int duration;
  final Complexity complexity;
  final Affordability affordability;
  MealItem(
      {@required this.title,
      @required this.duration,
      @required this.affordability,
      @required this.complexity,
      @required this.imageUrl,
      Key key})
      : super(key: key);

  void SelectMeal() {}

  String get complexityTest {
    if (complexity == Complexity.Simple) {
      return "Simple";
    }
    if (complexity == Complexity.Challenging) {
      return "Challenging";
    }
    if (complexity == Complexity.Hard) {
      return "Hard";
    }
  }

  String get affordabilityTest {
    if (affordability == Affordability.Pricey) {
      return "Pricey";
    }
    if (affordability == Affordability.Luxurious) {
      return "Expensive";
    }
    if (affordability == Affordability.Affordable) {
      return "Affordable";
    }
  }

  @override
  Widget build(BuildContext context) {
    return InkWell(
      onTap: SelectMeal,
      child: Card(
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(15)),
        elevation: 4,
        margin: const EdgeInsets.all(10),
        child: Column(
          children: [
            Stack(
              children: [
                ClipRRect(
                  borderRadius: const BorderRadius.only(
                    topLeft: Radius.circular(15),
                    topRight: Radius.circular(15),
                  ),
                  child: Image.network(
                    imageUrl,
                    height: 250,
                    width: double.infinity,
                    fit: BoxFit.cover,
                  ),
                ),
                Positioned(
                  bottom: 20,
                  right: 10,
                  child: Container(
                    padding: EdgeInsets.all(5),
                    width: 300,
                    color: Colors.black54,
                    child: Text(
                      title,
                      style: TextStyle(fontSize: 24, color: Colors.white),
                      overflow: TextOverflow.fade,
                      softWrap: true,
                    ),
                  ),
                )
              ],
            ),
            Padding(
                padding: EdgeInsets.all(20),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    Row(
                      children: [
                        Icon(Icons.schedule),
                        SizedBox(
                          width: 6,
                        ),
                        Text('$duration'),
                      ],
                    ),
                    Row(
                      children: [
                        Icon(Icons.work),
                        SizedBox(
                          width: 6,
                        ),
                        Text(complexityTest),
                      ],
                    ),
                    Row(
                      children: [
                        Icon(Icons.attach_money),
                        SizedBox(
                          width: 6,
                        ),
                        Text(affordabilityTest),
                      ],
                    ),
                  ],
                ))
          ],
        ),
      ),
    );
  }
}
