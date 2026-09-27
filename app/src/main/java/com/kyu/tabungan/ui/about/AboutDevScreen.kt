actionLabel = "Buka YouTube",
                badgeText = "YouTube",
                badgeBgColor = Color(0xFFFFEBEB),
                badgeTextColor = Color(0xFFFF2A2A),
                onClick = { openUrl("https://youtube.com/@julzzpiw?si=X7YMAD0AJVNZLUC5") }
            )
        }

        item {
            DevLinkCard(
                title = "Website TopUp Games Murah",
                subtitle = "Layanan topup e-wallet, games, pulsa/Kouta, dll",
                actionLabel = "Buka Website",
                badgeText = "JZTopUp",
                badgeBgColor = Color(0xFFF3E8FF),
                badgeTextColor = Color(0xFF7E22CE),
                onClick = { openUrl("https://jztopup.my.id") }
            )
        }

        item {
            NeoCard(
                modifier = Modifier.fillMaxWidth(),
                shadowOffset = 4.dp,
                cornerRadius = 12.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Tabungan v1.0.4",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Black,
                        color = TextMain
                    )
                    Text(
                        text = "Dilisensikan di bawah MIT License. Seluruh data keuangan Anda tersimpan 100% lokal pada perangkat ini.",
                        fontSize = 12.sp,
                        color = TextMuted,
                        lineHeight = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun DevLinkCard(
    title: String,
    subtitle: String,
    actionLabel: String,
    badgeText: String,
    badgeBgColor: Color,
    badgeTextColor: Color,
    onClick: () -> Unit
) {
    NeoCard(
        modifier = Modifier.fillMaxWidth(),
        shadowOffset = 4.dp,
        cornerRadius = 12.dp,
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black,
                    color = TextMain
                )

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(badgeBgColor)
                        .border(width = 1.dp, color = BorderColor, shape = RoundedCornerShape(6.dp))
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                ) {
                    Text(
                        text = badgeText,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = badgeTextColor
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = TextMuted
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                NeoButton(
                    text = actionLabel,
                    onClick = onClick,
                    shadowOffset = 2.dp,
                    borderWidth = 1.5.dp,
                    cornerRadius = 8.dp
                )
            }
        }
    }
}
