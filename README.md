# Outfit Rating Platform

A desktop social fashion application built with Java Swing where users can share outfit collections, rate each other's styles, follow other users, and leave comments. The project applies the MVC pattern together with a custom Observer pattern for real-time update propagation.

---

## Features

- **Authentication** — Login / register with credentials stored in XML
- **Home feed** — Browse outfit posts from the platform
- **Collections** — Create, view, and manage personal outfit collections
- **Like / Dislike** — Rate any outfit; counts are tracked per user
- **Follow / Unfollow** — Follow other users and track followers
- **Comments** — Leave comments on outfits
- **My Profile** — View own profile, liked outfits, and collections
- **View All Users** — Browse all registered users
- **Trends** — Discover trending outfits
- **Feedback form** — In-app feedback submission
- **Persistent storage** — Users stored in XML, outfits stored in JSON

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | **Java 13** (JavaSE-13) |
| UI Framework | Java Swing + MigLayout + JGoodies Forms |
| User data | XML (DOM parsing) |
| Outfit data | JSON |
| IDE | Eclipse |

---

## Architecture

The project follows the **MVC (Model-View-Controller)** pattern with a custom **Observer** pattern layered on top of the domain entities.

```
src/
├── App/                    # Entry point
│   ├── OutfitRatingPlatformApp    # main()
│   └── OutfitRatingPlatformManager
│
├── Entities/               # Domain models (all implement Subject)
│   ├── User                # followers, following, liked/disliked outfits, collections
│   ├── Outfit              # Subject — notifies observers on update
│   ├── Collection          # Named list of outfit IDs (Subject)
│   └── Comment
│
├── Observer/               # Custom Observer pattern
│   ├── Subject (interface)
│   ├── Observer (interface)
│   ├── IData (interface)
│   └── Data
│
├── Controller/             # MVC controllers
│   ├── LoginController
│   ├── MenuController
│   ├── OutfitController
│   ├── CollectionController
│   └── UserController
│
├── GUI/                    # Swing views (panels / frames)
│   ├── MainFrame
│   ├── WelcomePanel / BeforeLoginPanel / LoginPanel
│   ├── HomePage
│   ├── MenuPanel
│   ├── OutfitPanel
│   ├── ViewCollectionPanel
│   ├── MyProfile / ViewAllUsers
│   ├── AboutAppPanel / FeedbackPanel
│   └── (assets: logo.png, back.png, logout.png, trends.png)
│
└── FileIO/                 # XML parsing layer
    ├── ParseKnownXMLStructure
    ├── ParseUnknownXMLStructure
    └── PopulateDTOExamplesWithParsedXML
```

---

## Design Patterns

### 1. MVC (Model-View-Controller)

Every screen has a dedicated `GUI/` panel (View) and a `Controller/` class. Controllers attach action listeners to views, invoke domain/file logic, and swap panels within the shared `MainFrame`.

### 2. Observer Pattern (custom implementation)

`User`, `Outfit`, and `Collection` all implement the `Subject` interface. Any change (a new like, a new follower, a collection update) triggers `notifyUpdate()`, which pushes the event to all registered `Observer` instances — keeping dependent views in sync without tight coupling.

```
Subject (interface)  ←  Outfit / User / Collection
     │
     └──  notifyUpdate(arg)  →  Observer.update(arg)
                                      ↑
                               registered views / controllers
```

---

## Data Files

| File | Format | Contents |
|---|---|---|
| `users.xml` | XML | Username, password, followers, following, liked/disliked outfits, collections |
| `outfits.json` | JSON | Outfit ID, image reference, tags, rating data |

---

## Getting Started

### Prerequisites

- **Java 13** (JavaSE-13)
- Eclipse IDE (`.classpath` and `.project` included)
- `miglayout15-swing.jar` and `jgoodies-forms-1.8.0.jar` (already in project root)

### Run with Eclipse

1. `File → Import → Existing Projects into Workspace`
2. Select the cloned folder
3. Run `OutfitRatingPlatformApp.java` as a Java Application

### Run from the command line

```bash
# Windows
javac -cp ".;miglayout15-swing.jar;jgoodies-forms-1.8.0.jar" -d bin src/**/*.java
java  -cp "bin;miglayout15-swing.jar;jgoodies-forms-1.8.0.jar" App.OutfitRatingPlatformApp
```
