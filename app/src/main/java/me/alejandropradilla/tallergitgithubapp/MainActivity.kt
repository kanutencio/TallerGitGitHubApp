package me.alejandropradilla.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.alejandropradilla.tallergitgithubapp.ui.theme.TallerGitGitHubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PersonalCard(){
    Column(modifier = Modifier
        .fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(id = R.drawable.jeff),
            contentDescription = "es jeff",
            modifier = Modifier
                .height(200.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Alejandro Pradilla Castro",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Desarrollador movil Jr",
            color = Color.Blue,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(15.dp))
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 30.dp),
            thickness = 1.dp,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier.height(15.dp))

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.Start) {
            Text(
                text = "Edad",
                color = Color.Gray.copy(alpha = 0.6f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "20 años",
                color = Color.Black,
                fontSize = 18.sp,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Correo",
                color = Color.Gray.copy(alpha = 0.6f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "[email protected]",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 18.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
            Spacer(modifier = Modifier.height(10.dp))


            Text(
                text = "Ciudad",
                color = Color.Gray.copy(alpha = 0.6f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Bucaramanga",
                color = Color.Black,
                fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(10.dp))

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 30.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.height(10.dp))

            Column(modifier = Modifier
                .fillMaxSize().padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = "Sobre mi materia favorita",
                    color = Color.Gray.copy(alpha = 0.6f),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    modifier = Modifier
                        .padding(3.dp),
                    text = "Me apasiona el Desarrollo de Aplicaciones\n" +
                            "Möviles porque permite transformar ideas\n" +
                            "en herramientas tangibles que Ias\n" +
                            "personas usan a diario. Me encanta el reto\n" +
                            "de diseöar interfaces intuitivas.",
                    color = Color.Black,
                    fontSize = 18.sp,
                )
                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text="Contactar conmigo",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .background(
                            Color(0xFF1976D3),
                            shape = RoundedCornerShape(30.dp)
                        )
                        .padding(
                            all = 25.dp
                        )
                )
            }
        }

    }
}



