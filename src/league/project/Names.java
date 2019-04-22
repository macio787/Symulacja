package league.project;


import java.util.Random;

public class Names {

    public static String getName(){
        Random rand=new Random();
        return name[rand.nextInt(500)] + " " + surname[rand.nextInt(500)];
    }

    private static String[]name=
            {"Greg", "Theodore", "Quentin", "Anderson", "Gordon", "Arnoldo", "Leonard", "Ike", "Jame", "Foster", "Jae", "Angelo", "Fabian", "Chong", "Danial", "Wilfred", "Pete", "Augustus", "Nick", "Linwood", "Maximo", "Teddy", "Billie", "Courtney", "Logan", "Vern", "Louie", "Laurence", "Dorian", "Haywood", "Loren", "Tony", "Dee", "Irvin", "Jerrell", "Leon", "King", "Art", "Cyrus", "Samual", "Martin", "Johnnie", "Jeramy", "Garland", "Gary", "Stanton", "Rod", "Lamar", "Dave", "Heriberto", "Cameron", "Ty", "Wilburn", "Rashad", "Son", "Emory", "Brady", "Rob", "Cody", "Donn", "Milton", "Keneth", "Everett", "Timothy", "Dirk", "Octavio", "Benedict", "Lee", "Antonia", "Napoleon", "Keith", "Ernesto", "Elton", "Vernon", "Marcus", "Jeffrey", "Millard", "Isaiah", "Gerald", "Palmer", "Nickolas", "Josh", "Sydney", "Bryce", "Maxwell", "Roscoe", "Vicente", "Milan", "Jeremy", "Thad", "Moises", "Jacinto", "Mac", "Ken", "Barry", "Kareem", "Houston", "Donnell", "Shayne", "Adolph", "James", "Chet", "Antone", "Rey", "Marco", "Ross", "Garrett", "Earle", "Rick", "Winston", "Ernie", "Edwin", "Ezequiel", "Gayle", "Ronny", "Samuel", "Otha", "Jessie", "Lauren", "Arthur", "Tyrone", "Simon", "Carlo", "Alphonso", "Marcos", "Sandy", "Carol", "Cortez", "Derick", "Elmer", "Scot", "Russel", "Efrain", "Ferdinand", "Woodrow", "Bert", "Rodger", "Raymon", "Michel", "Albert", "Leroy", "Guillermo", "Antony", "Noah", "Shane", "Wyatt", "Prince", "Les", "Tommy", "Bryant", "Dexter", "Aron", "Gene", "Cedrick", "Brent", "Mary", "Rocky", "Emanuel", "Collin", "Danilo", "Abraham", "Cesar", "Keven", "Hiram", "Manual", "Kenneth", "Rhett", "George", "Renato", "Harland", "August", "Toby", "Maria", "Jarrett", "Dong", "Donald", "Jarvis", "Ricardo", "Bobbie", "Harlan", "Major", "Jere", "Brad", "Clyde", "Brock", "Ronnie", "Romeo", "Jerry", "Kenny", "Trinidad", "Galen", "Darwin", "Vito", "Garry", "Thurman", "Rodrigo", "Colby", "Avery", "Chas", "Dewayne", "Clay", "Willy", "Wilbur", "Claudio", "Philip", "Arlen", "Harrison", "Dannie", "Miquel", "Bertram", "Rosario", "Roosevelt", "Kory", "Casey", "Terry", "Mitchell", "Moshe", "Garret", "Daron", "Ezra", "Benjamin", "Weldon", "Elias", "Pierre", "Bernie", "Lonny", "Edmund", "Steve", "Howard", "Bennie", "Tobias", "Britt", "Rolland", "Jamison", "Kraig", "Erick", "Sylvester", "Sergio", "Herb", "Lindsey", "Joel", "Emmett", "Elbert", "Isaias", "Freddie", "Gaylord", "Tracy", "Val", "Salvatore", "Ulysses", "Winford", "Toney", "Noe", "Jules", "Morris", "Waldo", "Enoch", "Nestor", "Kendrick", "Floyd", "Alfonso", "Ellis", "Jon", "Rickey", "Jerald", "Trenton", "Robert", "Hilario", "Colton", "Dewey", "Raymundo", "Wendell", "Kelley", "Olen", "Yong", "Johnie", "Bradford", "Thaddeus", "Rory", "Parker", "Taylor", "Adan", "Hoyt", "Efren", "Jasper", "Lester", "Johnny", "Pedro", "Allan", "Jacob", "Marion", "Tyron", "Emery", "Mohammad", "Sam", "Sean", "Douglas", "Bernard", "Cleveland", "Nigel", "Ted", "Carmen", "Numbers", "Nelson", "Marty", "Alberto", "Mohammed", "Margarito", "Mauricio", "Brain", "Erich", "Fred", "Wayne", "Jerold", "Robin", "Sanford", "Joshua", "Wilford", "Kerry", "Carmine", "Richard", "Jay", "Armando", "Florencio", "Sammy", "Derek", "Shelby", "Jamie", "Franklyn", "Garfield", "Don", "Andrew", "Kelvin", "Miguel", "Cleo", "Antonio", "Edison", "Cruz", "Jean", "Len", "Gabriel", "Alec", "Deangelo", "Kennith", "Rueben", "Kevin", "Edmond", "Abdul", "Darnell", "Luis", "Frederic", "Terence", "Jarod", "Eugene", "Raul", "Chase", "Granville", "Lynwood", "Jose", "Riley", "Mitchel", "Karl", "Xavier", "Archie", "Lionel", "Johnson", "Clement", "Chuck", "Javier", "Paul", "Devon", "Reinaldo", "Roland", "Kristopher", "Fidel", "Victor", "Vincent", "Norris", "Berry", "Jan", "Alejandro", "Bart", "Cedric", "Cordell", "Benito", "Shon", "Joan", "Chance", "Buster", "Alphonse", "Charles", "Garth", "Otis", "Dale", "Erasmo", "Rudy", "Warner", "Emilio", "German", "Dustin", "Zachariah", "Kurt", "Wes", "Kurtis", "Geraldo", "Stephen", "Von", "Emmitt", "Francesco", "Percy", "Huey", "Claud", "Lemuel", "Noble", "Paris", "Sal", "Porter", "Tyree", "Hans", "Nathanial", "Odell", "Quintin", "Leland", "Phil", "Gonzalo", "Robby", "Valentin", "Jeffery", "Matt", "Shirley", "Russell", "Harley", "Curt", "Mario", "Jacques", "Brooks", "Truman", "Monty", "Gregorio", "Newton", "Scotty", "Marc", "Geoffrey", "Jonathan", "Cecil", "Rogelio", "Hosea", "Rickie", "Shad", "Andy", "Clemente", "Will", "Tim", "Ira", "Jordon", "Royce", "Rusty", "Dennis", "Barrett", "Brant", "Gerard", "Osvaldo", "Ezekiel", "Abram", "Dudley", "Isaac", "Gavin", "Ervin", "Dan", "Erik", "Tyler", "Beau", "Al", "Troy", "Jamey", "Marlin", "Chi", "Joaquin", "Santiago", "Elmo", "Jeff", "Ashley", "Wm", "Eldridge", "Doyle", "Williams", "Alexis", "Basil", "Eugenio", "Tanner", "Jim", "William", "Sammie", "Chris", "Rufus", "Stefan", "Bill", "Curtis", "Mohamed", "Monroe"};

    private static String [] surname=
            { "Payne", "Graham", "Schmitt", "Guzman", "Nichols", "Madden", "Mercer", "Obrien", "Conway", "Wong", "Hull", "Howe", "Horn", "Villarreal", "Hansen", "Soto", "Chung", "Hutchinson", "Velez", "Dodson", "Nielsen", "Fischer", "Bass", "Reyes", "Acevedo", "Howard", "Irwin", "Mcmillan", "Calderon", "Stone", "Maddox", "Allen", "Higgins", "Meadows", "Acosta", "Petty", "Odom", "Freeman", "Oneill", "Sampson", "Morrison", "Ramos", "Johnston", "Hess", "Cortez", "Best", "Bright", "Delacruz", "Beard", "Mora", "Castro", "Mccall", "Lucero", "Huynh", "Baker", "Montoya", "Diaz", "Flynn", "Gregory", "Church", "Sawyer", "Weber", "Dyer", "Henderson", "Mcmahon", "Rosario", "Duffy", "Delgado", "Lowe", "Glass", "Moody", "Bray", "Stewart", "Hayden", "Strickland", "Livingston", "Colon", "Ortiz", "Pitts", "Vang", "Harrell", "Kemp", "Frank", "Rush", "Mata", "Carey", "Melendez", "Walsh", "Parks", "Love", "Chambers", "Medina", "Sanders", "Travis", "Hoffman", "Day", "Page", "Fleming", "Lozano", "Frazier", "Salas", "Holland", "Krueger", "Lara", "Sherman", "Miller", "Potts", "Nicholson", "Donaldson", "Schneider", "Chan", "Mcgrath", "Barker", "Stanton", "Frederick", "Mcclain", "Hines", "Shaw", "Welch", "Macias", "Mckenzie", "Buchanan", "Riggs", "Thomas", "Carney", "Chang", "Giles", "Craig", "Heath", "Yang", "Hernandez", "Burch", "Weiss", "Clark", "Barber", "Mason", "Kim", "Perez", "Haney", "Estrada", "Yates", "Clarke", "Rowe", "Ponce", "Campbell", "Richardson", "Booker", "Crosby", "Hardy", "Whitehead", "Pollard", "Branch", "Key", "Walter", "Watts", "Keith", "Myers", "Mathews", "Hensley", "Norton", "Trujillo", "Munoz", "Cline", "Dennis", "Gaines", "Fitzpatrick", "Lynch", "Oconnell", "Sosa", "Watson", "Jacobson", "Braun", "Harrison", "Cabrera", "Mcfarland", "Mcgee", "Fry", "Burgess", "Reese", "Turner", "Vega", "Sloan", "Jimenez", "Frye", "Aguilar", "Larson", "Vance", "Patrick", "Tate", "Parker", "Harrington", "Stafford", "Wu", "Dalton", "Carson", "Mcintosh", "Boyle", "Moran", "Hurst", "Mullins", "York", "Wolfe", "Sanford", "Huerta", "Glenn", "Ho", "Barnes", "Simmons", "Beasley", "Rodriguez", "Floyd", "Mccormick", "Phillips", "Schaefer", "Daugherty", "Cole", "Carr", "Little", "Baird", "Larsen", "Hurley", "Kane", "Manning", "Mcguire", "Hatfield", "James", "Park", "Riley", "May", "Bonilla", "Lewis", "Walls", "Reeves", "Roberson", "Roach", "Singh", "Summers", "Michael", "Donovan", "Alexander", "Arroyo", "Wagner", "Watkins", "Sutton", "Pratt", "Sparks", "Moon", "Mccarthy", "Galloway", "Cain", "Krause", "Stein", "Christensen", "Rogers", "Saunders", "Rubio", "Valentine", "Moses", "Lin", "Hart", "Clements", "Pena", "Wang", "Ruiz", "Douglas", "Newton", "Vaughan", "Santana", "Long", "Swanson", "Andersen", "Montgomery", "Browning", "Waters", "Chavez", "Mayer", "Fox", "Thornton", "Oliver", "Knight", "Vargas", "Herring", "Woodard", "Bruce", "Armstrong", "Lucas", "Hancock", "Campos", "Merritt", "Rivera", "Hodge", "Farley", "Reilly", "Coffey", "Hicks", "Gallegos", "Williamson", "Dickerson", "Kerr", "Huffman", "Schroeder", "Holloway", "Hall", "Patterson", "Salinas", "Buck", "Jenkins", "Adams", "Downs", "Andrews", "Ball", "Berger", "Butler", "Scott", "Blevins", "Nelson", "Kline", "Frost", "Dorsey", "Guerrero", "David", "Rojas", "Bell", "Mays", "Ferrell", "Raymond", "Galvan", "Boone", "Anthony", "Shields", "Morton", "Rasmussen", "Henry", "Peck", "Barr", "Hanna", "Eaton", "Clay", "Warren", "Mcclure", "Mckinney", "Orr", "Mckay", "Foley", "Skinner", "Rivas", "Cardenas", "Hogan", "Callahan", "Silva", "Johnson", "Murphy", "English", "Wise", "Bryan", "Gamble", "Fernandez", "Edwards", "Blanchard", "Harmon", "Gilmore", "Wallace", "Richmond", "Cunningham", "Lane", "Atkinson", "Nixon", "Lam", "Middleton", "Lamb", "Hawkins", "Goodwin", "Whitney", "Ramirez", "George", "Randolph", "Daniels", "Ross", "Oconnor", "Cobb", "Peters", "Rich", "Santiago", "Bartlett", "Barnett", "Rocha", "Bryant", "Steele", "Gould", "West", "Kelley", "Lambert", "Morrow", "Lopez", "Wilkinson", "Murray", "Villa", "Griffin", "Parsons", "Gilbert", "Garcia", "Cisneros", "Bolton", "Gentry", "Benson", "Olsen", "Duran", "Anderson", "Gonzalez", "Odonnell", "Griffith", "Mendoza", "Norman", "Durham", "Taylor", "Banks", "Stout", "Robbins", "Orozco", "Luna", "Maldonado", "Morgan", "Le", "Roberts", "Pearson", "Small", "Arnold", "Gates", "Riddle", "Palmer", "Solomon", "Strong", "Pace", "Landry", "Lee", "Ramsey", "Lloyd", "Shea", "Hardin", "Fuentes", "Fritz", "Ford", "Gross", "Figueroa", "Velasquez", "Hester", "Leblanc", "Sweeney", "Carrillo", "Cherry", "Mann", "Bowman", "Conrad", "Brennan", "Mcconnell", "Evans", "Pope", "Cooke", "Bentley", "Miranda", "Estes", "Rodgers", "Zhang", "Mcdonald", "Conner", "Cross", "Lyons", "Martin", "Bauer", "Graves", "Ballard", "Dawson", "Harris", "Jarvis", "Knapp", "Cruz", "Wood", "Harding", "Wheeler", "Richard", "Collier", "Fletcher", "Stevenson", "Stark", "Holden", "Jacobs", "Hendrix", "Sheppard", "Vaughn", "Reynolds", "Gillespie", "Walton", "Grant", "Dunlap", "Perkins", "Navarro", "Oneal", "Kaiser", "Mcknight", "Gomez"  };


}
