package pe.edu.notcodingdevs.recruitech.Profile.data.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import pe.edu.notcodingdevs.recruitech.Profile.data.model.DigitalProfile

@Composable
fun DigitalProfiles(
    digitalProfile: DigitalProfile,
    modifier: Modifier = Modifier
){

    Column(modifier = Modifier.fillMaxSize()){
        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Text(fontSize = 20.sp,text = "Profile")

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(210.dp)
                //.background(Color.Gray)
            ) {

            }
        }

        Row(){
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(){
                    Text(text = digitalProfile.firstName)
                    Text(text = digitalProfile.lastName)
                }
                Row(){
                    Text(text = digitalProfile.role)
                }
                Row(){
                    Text(textAlign = TextAlign.Justify,
                        text = digitalProfile.description)
                }
            }
        }

        Row(){
            var tabs = listOf("Experience", "Portfolio")
            var selectedIndex = 0
            var tabContent = listOf(
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.DarkGray)
                    .height(30.dp)

                ){
                    Text(text = "Prueba1")
                }
                ,Row(modifier = Modifier
                    .fillMaxWidth()
                    //.background(color = Color.Gray)
                    .height(30.dp)
                ){
                    Text(text = "Prueba2")
                }

            )
            Column() {
                TabRow(selectedTabIndex = 0,
                    Modifier
                        //.background(color = Color.Red)
                        .fillMaxWidth()
                        .height(30.dp)) {
                    tabs.forEachIndexed { index, title ->
                        Tab(
                            content = {Text(text = title)},
                            selected = selectedIndex == index,
                            onClick =  {selectedIndex = index}
                        )
                    }
                }
                tabContent[selectedIndex]
            }

        }
        /*
        Row(){

        }*/
    }
}