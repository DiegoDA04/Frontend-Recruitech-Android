package pe.edu.notcodingdevs.recruitech.messages.presentation.channels

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import pe.edu.notcodingdevs.recruitech.messages.domain.model.LMessage
import pe.edu.notcodingdevs.recruitech.ui.theme.*

private val LMessages: List<LMessage> = mutableListOf(
    LMessage(
        //unspash photo profile
        imageProfile = "https://randomuser.me/api/portraits/men/77.jpg",
        name = "Luis",
        lastMessage = "Hola, como estas?",
        lastTime = "12:00",
        newMessages = 1
    ), LMessage(
        //unspash photo profile
        imageProfile = "https://randomuser.me/api/portraits/men/77.jpg",
        name = "Ashik Bukele Kboom",
        lastMessage = "Hola, vendo criptomonedas , estas interesado? ",
        lastTime = "5:00",
        newMessages = 1
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChannelsScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp), contentAlignment = Alignment.Center
        ) {
            Text(
                lineHeight = 3.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF262626),
                text = "Messages",
                fontSize = 26.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
//        Spacer(modifier = Modifier.height(20.dp))
        val search = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = search.value,
            onValueChange = { search.value = it },
            shape = RoundedCornerShape(10.dp),
            textStyle = MaterialTheme.typography.bodyMedium,
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
            placeholder = { Text("Search") },
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Grey40,
                containerColor = Color.White,
                placeholderColor = Grey20,
                focusedLeadingIconColor = Grey40,
                unfocusedLeadingIconColor = Grey20,
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                focusedTrailingIconColor = Grey40,
                unfocusedTrailingIconColor = Grey20,
                cursorColor = Grey40
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        ChannelList(LMessages)
    }

}

@Composable
fun ChannelList(LMessages: List<LMessage>) {
    LazyColumn {
        items(LMessages) { chat ->
            ChannelItem(chat)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChannelItem(LMessage: LMessage) {
    Card(
        onClick = {
                  //TODO: Navigate to chat screen
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent, contentColor = Color.Black
        )
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = "https://randomuser.me/api/portraits/med/men/77.jpg",
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(50.dp)
                    .background(Grey20, RoundedCornerShape(50.dp)),
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (modifier = Modifier.width(200.dp)) {
                    Text(text = LMessage.name, fontWeight = FontWeight.ExtraBold, fontSize = 15.sp)
                    Text(
                        text = LMessage.lastMessage,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = Grey40,
                        maxLines = 1
                    )
                }
                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = LMessage.lastTime,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = Grey40
                    )
                    Text(
                        text = LMessage.newMessages.toString(),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        modifier = Modifier
                            .size(15.dp)
                            .background(Blue40, RoundedCornerShape(50.dp))
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChannelsScreen()
}