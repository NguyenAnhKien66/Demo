import 'package:demo_ccptpm/nav_bottom.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';

class Index_Screen extends StatelessWidget {
  const Index_Screen({super.key,required this.idx});
  final idx;
  @override
  Widget build(BuildContext context) {
    return  Scaffold(appBar: AppBar(title:const Text('Trang chủ',style: (TextStyle()),)),
    drawer:  Drawer(
        child:  ListView(
          children: <Widget> [
            const DrawerHeader(
              decoration: BoxDecoration(
                color: Colors.blue,
              ),
              child: Text(
                'Menu',
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 30,
                
                ),
              ),
            ),
            
            ListTile(
              leading: Icon(Icons.home),
              title: Text('Trang chu',style: TextStyle(color: idx==0? Colors.blue: Colors.grey)),
              onTap:(){
              Navigator.popUntil(context, (route) => route.isFirst);
              Navigator.pushNamed(context, '/');
              }
            ),
             ListTile(
              leading: const Icon(Icons.account_circle),
              title: Text('ca nhan',style: TextStyle(color: idx==1? Colors.blue: Colors.grey),), 
            ),
            ListTile(
              leading: const Icon(Icons.store),
              title: Text('cua hang',style: TextStyle(color: idx==2? Colors.blue: Colors.grey),), 
            ),
            ListTile(
              leading: const Icon(Icons.shopping_bag),
              title: Text('gio hang',style: TextStyle(color: idx==3? Colors.blue: Colors.grey),), 
            )
          ],
        ),
        
      ),
    bottomNavigationBar: const nav_bottom(idx: 0),
      
    );
    
  }
}