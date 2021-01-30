package es.unsplash.client.mother;

import es.unsplash.client.infrastructure.service.dto.UnsplashCollectionDTO;
import es.unsplash.client.infrastructure.service.dto.UnsplashCoverPhotoDTO;

public class UnsplashCollectionsResponseMother {

  public static String generateOKResponse() {

    return "[\n" +
        "  {\n" +
        "    \"id\": \"9454911\",\n" +
        "    \"title\": \"BASKETBALL\",\n" +
        "    \"description\": null,\n" +
        "    \"published_at\": \"2021-01-14T19:53:32Z\",\n" +
        "    \"last_collected_at\": \"2020-08-30T21:22:51-04:00\",\n" +
        "    \"updated_at\": \"2021-01-14T14:53:32-05:00\",\n" +
        "    \"curated\": false,\n" +
        "    \"featured\": true,\n" +
        "    \"total_photos\": 35,\n" +
        "    \"private\": false,\n" +
        "    \"share_key\": \"b8d7745ccd1429a07269be5d0c757210\",\n" +
        "    \"tags\": [\n" +
        "      {\n" +
        "        \"type\": \"landing_page\",\n" +
        "        \"title\": \"basketball\",\n" +
        "        \"source\": {\n" +
        "          \"ancestry\": {\n" +
        "            \"type\": {\n" +
        "              \"slug\": \"images\",\n" +
        "              \"pretty_slug\": \"Images\"\n" +
        "            },\n" +
        "            \"category\": {\n" +
        "              \"slug\": \"sports\",\n" +
        "              \"pretty_slug\": \"Sports\"\n" +
        "            },\n" +
        "            \"subcategory\": {\n" +
        "              \"slug\": \"basketball\",\n" +
        "              \"pretty_slug\": \"Basketball\"\n" +
        "            }\n" +
        "          },\n" +
        "          \"title\": \"Basketball Images & Pictures\",\n" +
        "          \"subtitle\": \"Download free basketball images\",\n" +
        "          \"description\": \"Choose from a curated selection of basketball photos. Always free on Unsplash.\",\n" +
        "          \"meta_title\": \"100+ Basketball Pictures | Download Free Images & Stock Photos on Unsplash\",\n" +
        "          \"meta_description\": \"Choose from hundreds of free basketball pictures. Download HD basketball photos for free on Unsplash.\",\n" +
        "          \"cover_photo\": {\n" +
        "            \"id\": \"57rD2oDZquc\",\n" +
        "            \"created_at\": \"2016-09-18T14:40:52-04:00\",\n" +
        "            \"updated_at\": \"2021-01-12T11:00:49-05:00\",\n" +
        "            \"promoted_at\": \"2016-09-18T14:40:52-04:00\",\n" +
        "            \"width\": 4094,\n" +
        "            \"height\": 2730,\n" +
        "            \"color\": \"#738c8c\",\n" +
        "            \"blur_hash\": \"LZG[$WozD*NH0-bI%0xtMxt6RlRk\",\n" +
        "            \"description\": \"Outdoor basketball in Venice\",\n" +
        "            \"alt_description\": \"silhouette photo of basketball system\",\n" +
        "            \"urls\": {\n" +
        "              \"raw\": \"https://images.unsplash.com/photo-1474224017046-182ece80b263?ixlib=rb-1.2.1\",\n" +
        "              \"full\": \"https://images.unsplash.com/photo-1474224017046-182ece80b263?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "              \"regular\": \"https://images.unsplash.com/photo-1474224017046-182ece80b263?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "              \"small\": \"https://images.unsplash.com/photo-1474224017046-182ece80b263?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "              \"thumb\": \"https://images.unsplash.com/photo-1474224017046-182ece80b263?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "            },\n" +
        "            \"links\": {\n" +
        "              \"self\": \"https://api.unsplash.com/photos/57rD2oDZquc\",\n" +
        "              \"html\": \"https://unsplash.com/photos/57rD2oDZquc\",\n" +
        "              \"download\": \"https://unsplash.com/photos/57rD2oDZquc/download\",\n" +
        "              \"download_location\": \"https://api.unsplash.com/photos/57rD2oDZquc/download\"\n" +
        "            },\n" +
        "            \"categories\": [],\n" +
        "            \"likes\": 647,\n" +
        "            \"liked_by_user\": false,\n" +
        "            \"current_user_collections\": [],\n" +
        "            \"sponsorship\": null,\n" +
        "            \"user\": {\n" +
        "              \"id\": \"6RK0K-2x7Jg\",\n" +
        "              \"updated_at\": \"2021-01-13T01:01:58-05:00\",\n" +
        "              \"username\": \"nicholasjio\",\n" +
        "              \"name\": \"Nick Jio\",\n" +
        "              \"first_name\": \"Nick\",\n" +
        "              \"last_name\": \"Jio\",\n" +
        "              \"twitter_username\": \"nicholasjio\",\n" +
        "              \"portfolio_url\": null,\n" +
        "              \"bio\": null,\n" +
        "              \"location\": \"san diego, ca\",\n" +
        "              \"links\": {\n" +
        "                \"self\": \"https://api.unsplash.com/users/nicholasjio\",\n" +
        "                \"html\": \"https://unsplash.com/@nicholasjio\",\n" +
        "                \"photos\": \"https://api.unsplash.com/users/nicholasjio/photos\",\n" +
        "                \"likes\": \"https://api.unsplash.com/users/nicholasjio/likes\",\n" +
        "                \"portfolio\": \"https://api.unsplash.com/users/nicholasjio/portfolio\",\n" +
        "                \"following\": \"https://api.unsplash.com/users/nicholasjio/following\",\n" +
        "                \"followers\": \"https://api.unsplash.com/users/nicholasjio/followers\"\n" +
        "              },\n" +
        "              \"profile_image\": {\n" +
        "                \"small\": \"https://images.unsplash.com/profile-1474225371016-1aac855180c8?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "                \"medium\": \"https://images.unsplash.com/profile-1474225371016-1aac855180c8?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "                \"large\": \"https://images.unsplash.com/profile-1474225371016-1aac855180c8?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "              },\n" +
        "              \"instagram_username\": \"nicholasjio\",\n" +
        "              \"total_collections\": 1,\n" +
        "              \"total_likes\": 423,\n" +
        "              \"total_photos\": 59,\n" +
        "              \"accepted_tos\": false\n" +
        "            }\n" +
        "          }\n" +
        "        }\n" +
        "      },\n" +
        "      {\n" +
        "        \"type\": \"landing_page\",\n" +
        "        \"title\": \"sport\",\n" +
        "        \"source\": {\n" +
        "          \"ancestry\": {\n" +
        "            \"type\": {\n" +
        "              \"slug\": \"images\",\n" +
        "              \"pretty_slug\": \"Images\"\n" +
        "            },\n" +
        "            \"category\": {\n" +
        "              \"slug\": \"sports\",\n" +
        "              \"pretty_slug\": \"Sports\"\n" +
        "            }\n" +
        "          },\n" +
        "          \"title\": \"Sports Images\",\n" +
        "          \"subtitle\": \"Download free sports images\",\n" +
        "          \"description\": \"Few images capture the verve, energy, and tension of human life better than sports images. Capturing bodies in motion is no easy feat, so Unsplash has curated an only-the-finest selection of sporting images that cover everything from yoga and dancing to football and baseball\",\n" +
        "          \"meta_title\": \"Best 100+ Sports Pictures | Download Free Images on Unsplash\",\n" +
        "          \"meta_description\": \"Choose from hundreds of free sports pictures. Download HD sports photos for free on Unsplash.\",\n" +
        "          \"cover_photo\": {\n" +
        "            \"id\": \"hawN8XnaJuY\",\n" +
        "            \"created_at\": \"2019-06-09T10:35:21-04:00\",\n" +
        "            \"updated_at\": \"2020-12-22T05:08:53-05:00\",\n" +
        "            \"promoted_at\": null,\n" +
        "            \"width\": 3012,\n" +
        "            \"height\": 4016,\n" +
        "            \"color\": \"#0c4059\",\n" +
        "            \"blur_hash\": \"LT8s6UM|bvWVQRt7bHjsI:t6nhf6\",\n" +
        "            \"description\": null,\n" +
        "            \"alt_description\": \"person on swimming pool\",\n" +
        "            \"urls\": {\n" +
        "              \"raw\": \"https://images.unsplash.com/photo-1560089000-7433a4ebbd64?ixlib=rb-1.2.1\",\n" +
        "              \"full\": \"https://images.unsplash.com/photo-1560089000-7433a4ebbd64?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "              \"regular\": \"https://images.unsplash.com/photo-1560089000-7433a4ebbd64?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "              \"small\": \"https://images.unsplash.com/photo-1560089000-7433a4ebbd64?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "              \"thumb\": \"https://images.unsplash.com/photo-1560089000-7433a4ebbd64?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "            },\n" +
        "            \"links\": {\n" +
        "              \"self\": \"https://api.unsplash.com/photos/hawN8XnaJuY\",\n" +
        "              \"html\": \"https://unsplash.com/photos/hawN8XnaJuY\",\n" +
        "              \"download\": \"https://unsplash.com/photos/hawN8XnaJuY/download\",\n" +
        "              \"download_location\": \"https://api.unsplash.com/photos/hawN8XnaJuY/download\"\n" +
        "            },\n" +
        "            \"categories\": [],\n" +
        "            \"likes\": 103,\n" +
        "            \"liked_by_user\": false,\n" +
        "            \"current_user_collections\": [],\n" +
        "            \"sponsorship\": null,\n" +
        "            \"user\": {\n" +
        "              \"id\": \"lfi6pSENbQ8\",\n" +
        "              \"updated_at\": \"2020-12-22T18:37:19-05:00\",\n" +
        "              \"username\": \"serenarepice\",\n" +
        "              \"name\": \"Serena Repice Lentini\",\n" +
        "              \"first_name\": \"Serena\",\n" +
        "              \"last_name\": \"Repice Lentini\",\n" +
        "              \"twitter_username\": \"serenarepice\",\n" +
        "              \"portfolio_url\": \"https://www.instagram.com/serenarepice/\",\n" +
        "              \"bio\": \"Photographer based in Rome //\\r\\nFollow on Instagram for more @serenarepice\",\n" +
        "              \"location\": \"Rome, Italy\",\n" +
        "              \"links\": {\n" +
        "                \"self\": \"https://api.unsplash.com/users/serenarepice\",\n" +
        "                \"html\": \"https://unsplash.com/@serenarepice\",\n" +
        "                \"photos\": \"https://api.unsplash.com/users/serenarepice/photos\",\n" +
        "                \"likes\": \"https://api.unsplash.com/users/serenarepice/likes\",\n" +
        "                \"portfolio\": \"https://api.unsplash.com/users/serenarepice/portfolio\",\n" +
        "                \"following\": \"https://api.unsplash.com/users/serenarepice/following\",\n" +
        "                \"followers\": \"https://api.unsplash.com/users/serenarepice/followers\"\n" +
        "              },\n" +
        "              \"profile_image\": {\n" +
        "                \"small\": \"https://images.unsplash.com/profile-fb-1544872764-aa6d1a869637.jpg?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "                \"medium\": \"https://images.unsplash.com/profile-fb-1544872764-aa6d1a869637.jpg?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "                \"large\": \"https://images.unsplash.com/profile-fb-1544872764-aa6d1a869637.jpg?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "              },\n" +
        "              \"instagram_username\": \"serenarepice\",\n" +
        "              \"total_collections\": 2,\n" +
        "              \"total_likes\": 472,\n" +
        "              \"total_photos\": 211,\n" +
        "              \"accepted_tos\": true\n" +
        "            }\n" +
        "          }\n" +
        "        }\n" +
        "      },\n" +
        "      {\n" +
        "        \"type\": \"search\",\n" +
        "        \"title\": \"hoop\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"type\": \"search\",\n" +
        "        \"title\": \"basketball court\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"type\": \"search\",\n" +
        "        \"title\": \"team sport\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"type\": \"search\",\n" +
        "        \"title\": \"team\"\n" +
        "      }\n" +
        "    ],\n" +
        "    \"links\": {\n" +
        "      \"self\": \"https://api.unsplash.com/collections/9454911\",\n" +
        "      \"html\": \"https://unsplash.com/collections/9454911/basketball\",\n" +
        "      \"photos\": \"https://api.unsplash.com/collections/9454911/photos\",\n" +
        "      \"related\": \"https://api.unsplash.com/collections/9454911/related\"\n" +
        "    },\n" +
        "    \"user\": {\n" +
        "      \"id\": \"wqG2W9TmKdQ\",\n" +
        "      \"updated_at\": \"2021-01-25T00:53:35-05:00\",\n" +
        "      \"username\": \"takethreestudio\",\n" +
        "      \"name\": \"TakeThree Studio\",\n" +
        "      \"first_name\": \"TakeThree\",\n" +
        "      \"last_name\": \"Studio\",\n" +
        "      \"twitter_username\": null,\n" +
        "      \"portfolio_url\": \"http://takethreestudio.com\",\n" +
        "      \"bio\": \"Creative Duo & Design Studio??\\r\\n?We help brands tell their stories ??Branding, Strategy & Websites ?1:1 Mentorship & Creative Consulting on takethreeuni.com\",\n" +
        "      \"location\": \"Quito, Ecuador\",\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/users/takethreestudio\",\n" +
        "        \"html\": \"https://unsplash.com/@takethreestudio\",\n" +
        "        \"photos\": \"https://api.unsplash.com/users/takethreestudio/photos\",\n" +
        "        \"likes\": \"https://api.unsplash.com/users/takethreestudio/likes\",\n" +
        "        \"portfolio\": \"https://api.unsplash.com/users/takethreestudio/portfolio\",\n" +
        "        \"following\": \"https://api.unsplash.com/users/takethreestudio/following\",\n" +
        "        \"followers\": \"https://api.unsplash.com/users/takethreestudio/followers\"\n" +
        "      },\n" +
        "      \"profile_image\": {\n" +
        "        \"small\": \"https://images.unsplash.com/profile-1587180354083-f4de641c9d8aimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "        \"medium\": \"https://images.unsplash.com/profile-1587180354083-f4de641c9d8aimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "        \"large\": \"https://images.unsplash.com/profile-1587180354083-f4de641c9d8aimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "      },\n" +
        "      \"instagram_username\": \"takethreestudio\",\n" +
        "      \"total_collections\": 14,\n" +
        "      \"total_likes\": 9,\n" +
        "      \"total_photos\": 0,\n" +
        "      \"accepted_tos\": false\n" +
        "    },\n" +
        "    \"cover_photo\": {\n" +
        "      \"id\": \"8hW2ZB4OHZ0\",\n" +
        "      \"created_at\": \"2018-07-19T18:52:52-04:00\",\n" +
        "      \"updated_at\": \"2021-01-28T00:03:54-05:00\",\n" +
        "      \"promoted_at\": null,\n" +
        "      \"width\": 4928,\n" +
        "      \"height\": 3264,\n" +
        "      \"color\": \"#a68c40\",\n" +
        "      \"blur_hash\": \"LFBf8:5859XR0i%0xsni59%0xYn%\",\n" +
        "      \"description\": \"The Last Throw\",\n" +
        "      \"alt_description\": \"Lakers player taking technical freethrow\",\n" +
        "      \"urls\": {\n" +
        "        \"raw\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1\",\n" +
        "        \"full\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "        \"regular\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "        \"small\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "        \"thumb\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "      },\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/photos/8hW2ZB4OHZ0\",\n" +
        "        \"html\": \"https://unsplash.com/photos/8hW2ZB4OHZ0\",\n" +
        "        \"download\": \"https://unsplash.com/photos/8hW2ZB4OHZ0/download\",\n" +
        "        \"download_location\": \"https://api.unsplash.com/photos/8hW2ZB4OHZ0/download\"\n" +
        "      },\n" +
        "      \"categories\": [],\n" +
        "      \"likes\": 412,\n" +
        "      \"liked_by_user\": false,\n" +
        "      \"current_user_collections\": [],\n" +
        "      \"sponsorship\": null,\n" +
        "      \"user\": {\n" +
        "        \"id\": \"rxhH8DtETx8\",\n" +
        "        \"updated_at\": \"2021-01-27T23:18:50-05:00\",\n" +
        "        \"username\": \"rapiana\",\n" +
        "        \"name\": \"Ramiro Pianarosa\",\n" +
        "        \"first_name\": \"Ramiro\",\n" +
        "        \"last_name\": \"Pianarosa\",\n" +
        "        \"twitter_username\": null,\n" +
        "        \"portfolio_url\": \"http://instagram.com/rpianarosa\",\n" +
        "        \"bio\": \"Buenos Aires based photographer\",\n" +
        "        \"location\": \"Argentina\",\n" +
        "        \"links\": {\n" +
        "          \"self\": \"https://api.unsplash.com/users/rapiana\",\n" +
        "          \"html\": \"https://unsplash.com/@rapiana\",\n" +
        "          \"photos\": \"https://api.unsplash.com/users/rapiana/photos\",\n" +
        "          \"likes\": \"https://api.unsplash.com/users/rapiana/likes\",\n" +
        "          \"portfolio\": \"https://api.unsplash.com/users/rapiana/portfolio\",\n" +
        "          \"following\": \"https://api.unsplash.com/users/rapiana/following\",\n" +
        "          \"followers\": \"https://api.unsplash.com/users/rapiana/followers\"\n" +
        "        },\n" +
        "        \"profile_image\": {\n" +
        "          \"small\": \"https://images.unsplash.com/profile-1604616353412-ba62170cded9image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "          \"medium\": \"https://images.unsplash.com/profile-1604616353412-ba62170cded9image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "          \"large\": \"https://images.unsplash.com/profile-1604616353412-ba62170cded9image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "        },\n" +
        "        \"instagram_username\": \"rpianarosa\",\n" +
        "        \"total_collections\": 1,\n" +
        "        \"total_likes\": 6,\n" +
        "        \"total_photos\": 75,\n" +
        "        \"accepted_tos\": true\n" +
        "      }\n" +
        "    },\n" +
        "    \"preview_photos\": [\n" +
        "      {\n" +
        "        \"id\": \"8hW2ZB4OHZ0\",\n" +
        "        \"created_at\": \"2018-07-19T18:52:52-04:00\",\n" +
        "        \"updated_at\": \"2021-01-28T00:03:54-05:00\",\n" +
        "        \"blur_hash\": \"LFBf8:5859XR0i%0xsni59%0xYn%\",\n" +
        "        \"urls\": {\n" +
        "          \"raw\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1\",\n" +
        "          \"full\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "          \"regular\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "          \"small\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "          \"thumb\": \"https://images.unsplash.com/photo-1532040683343-edbde6dd500d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "        }\n" +
        "      },\n" +
        "      {\n" +
        "        \"id\": \"dNnlhR0zvAE\",\n" +
        "        \"created_at\": \"2020-01-27T13:33:30-05:00\",\n" +
        "        \"updated_at\": \"2021-01-28T00:03:32-05:00\",\n" +
        "        \"blur_hash\": \"LWOf.AV?IURj_Nfl%NRjIsayRjaz\",\n" +
        "        \"urls\": {\n" +
        "          \"raw\": \"https://images.unsplash.com/photo-1580149959316-75e2487cfb06?ixlib=rb-1.2.1\",\n" +
        "          \"full\": \"https://images.unsplash.com/photo-1580149959316-75e2487cfb06?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "          \"regular\": \"https://images.unsplash.com/photo-1580149959316-75e2487cfb06?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "          \"small\": \"https://images.unsplash.com/photo-1580149959316-75e2487cfb06?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "          \"thumb\": \"https://images.unsplash.com/photo-1580149959316-75e2487cfb06?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "        }\n" +
        "      },\n" +
        "      {\n" +
        "        \"id\": \"nkgycYvPlAY\",\n" +
        "        \"created_at\": \"2020-01-27T13:33:30-05:00\",\n" +
        "        \"updated_at\": \"2021-01-27T11:10:11-05:00\",\n" +
        "        \"blur_hash\": \"LRP6pwoe.9ogx]oKt7WB?wRiITxu\",\n" +
        "        \"urls\": {\n" +
        "          \"raw\": \"https://images.unsplash.com/photo-1580149959197-e48d1f587067?ixlib=rb-1.2.1\",\n" +
        "          \"full\": \"https://images.unsplash.com/photo-1580149959197-e48d1f587067?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "          \"regular\": \"https://images.unsplash.com/photo-1580149959197-e48d1f587067?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "          \"small\": \"https://images.unsplash.com/photo-1580149959197-e48d1f587067?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "          \"thumb\": \"https://images.unsplash.com/photo-1580149959197-e48d1f587067?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "        }\n" +
        "      },\n" +
        "      {\n" +
        "        \"id\": \"OuisdiaZn68\",\n" +
        "        \"created_at\": \"2019-04-29T12:22:43-04:00\",\n" +
        "        \"updated_at\": \"2021-01-28T00:03:22-05:00\",\n" +
        "        \"blur_hash\": \"LCP|kG5t?G-:?GNfX8X9}=$%IWR-\",\n" +
        "        \"urls\": {\n" +
        "          \"raw\": \"https://images.unsplash.com/flagged/photo-1556554946-c10ef755bded?ixlib=rb-1.2.1\",\n" +
        "          \"full\": \"https://images.unsplash.com/flagged/photo-1556554946-c10ef755bded?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb\",\n" +
        "          \"regular\": \"https://images.unsplash.com/flagged/photo-1556554946-c10ef755bded?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max\",\n" +
        "          \"small\": \"https://images.unsplash.com/flagged/photo-1556554946-c10ef755bded?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max\",\n" +
        "          \"thumb\": \"https://images.unsplash.com/flagged/photo-1556554946-c10ef755bded?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max\"\n" +
        "        }\n" +
        "      }\n" +
        "    ]\n" +
        "  }\n" +
        "]";

  }

  public static UnsplashCollectionDTO generateOKResponseObject() {

    return new UnsplashCollectionDTO("9454911",
        "BASKETBALL",
        null,
        new UnsplashCoverPhotoDTO("8hW2ZB4OHZ0"));

  }

}
