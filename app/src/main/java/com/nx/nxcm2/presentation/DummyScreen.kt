package com.nx.nxcm2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.nx.nxcm2.R
import com.nx.nxcm2.component.ProductCard
import com.nx.nxcm2.component.SliderBanner
import com.nx.nxcm2.component.Tabs
import com.nx.nxcm2.component.TabsContent
import com.nx.nxcm2.navigation.ScreenTab

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.colorPrimaryDark))
            .wrapContentSize(Alignment.Center)
    ) {
        SliderBanner()
        Text(
            text = "Home View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MusicScreen() {

    val tabs = listOf(ScreenTab.ScreenTabA, ScreenTab.ScreenTabB, ScreenTab.ScreenTabC)
    val pagerState = rememberPagerState()

    Column {
        Tabs(tt = tabs, pagerState = pagerState)
        TabsContent(ttt = tabs, pagerState = pagerState)
        Text(
            text = "Music View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}


@Composable
fun MoviesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.colorPrimaryDark))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Movies View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}


@Composable
fun BooksScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.colorPrimaryDark))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Books View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}


@Composable
fun ProfileScreen() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.colorPrimaryDark))
//            .wrapContentSize(Alignment.Center)
//    ) {
//        Text(
//            text = "Profile View",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            modifier = Modifier.align(Alignment.CenterHorizontally),
//            textAlign = TextAlign.Center,
//            fontSize = 25.sp
//        )
//    }
//}

    Column {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(height = 350.dp)
                    .background(color = Color.Green)
                    .fillMaxSize()
            ) {
                Row {
                    Icon(
                        imageVector = Icons.Outlined.Menu,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.imagetabb),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                )
                Row(modifier = Modifier.align(Alignment.BottomEnd)) {
                    Icon(imageVector = Icons.Outlined.Star, contentDescription = null)
                    Icon(imageVector = Icons.Outlined.Favorite, contentDescription = null)
                    Icon(imageVector = Icons.Outlined.Share, contentDescription = null)

                }
            }
            Text(text = "Jimmy")
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(text = "3 Year Old")
            Icon(imageVector = Icons.Outlined.ThumbUp, contentDescription = null)
            Text(text = "Jimmy")
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing /n" +
                        "and typesetting industry. Lorem Ipsum has been the /n" +
                        "industry's standard dummy text ever since the 1500s, /n" +
                        "when an unknown printer took a galley of type and"
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = null)
            Text(text = "address")
            Text(text = "address")
            Spacer(modifier = Modifier.padding(top = 200.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CutCornerShape(4.dp),
                modifier = Modifier
                    .height(40.dp)
                    .width(300.dp)
            ) { Text(text = "Following") }
            Spacer(modifier = Modifier.padding(top = 4.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CutCornerShape(4.dp),
                modifier = Modifier
                    .height(40.dp)
                    .width(300.dp)
            ) { Text(text = "Adopt Me") }
        }
    }
}


@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.colorPrimaryDark))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Settings View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun ScreenTabA() {
    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.colorPrimaryDark))
//            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagetaba),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
        )
        Text(
            text = "TAB A",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun ScreenTabB() {
    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.colorPrimaryDark))
//            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagetabb),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
        )

        Text(
            text = "TAB B",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun ScreenTabC() {
    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.colorPrimaryDark))
//            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagetabe),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
        )

        Text(
            text = "TAB C",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun ScreenDrawerA() {
    Text(text = "SCREE DRAWER A")
}

@Composable
fun ScreenDrawerB() {
    Text(text = "SCREE DRAWER B")
}

@Composable
fun ScreenDrawerC() {
    Text(text = "SCREE DRAWER C")
}

@Composable
fun ScreenDrawerD() {
    Text(text = "SCREE DRAWER D")
}

@Composable
fun ScreenDrawerE() {
    Text(text = "SCREE DRAWER E")
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ScreenDrawerF() {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(padding)
        ) {
            Spacer(modifier = Modifier.padding(top = 4.dp))
            SliderBanner()
            ProductCard()
        }
    }
}

