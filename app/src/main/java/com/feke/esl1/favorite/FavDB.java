package com.feke.esl1.favorite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class FavDB extends SQLiteOpenHelper {

    public static String FIRST_START = "id";
    public static String FIRST_START_NAME = "firstStart";
    public static String KEY_ID = "id";
    public static String ITEM_TITLE = "itemTitle";
    public static String ITEM_DISK = "itemDisk";
    public static String IMAGE_FOLDER = "imageFolder";
    public static String IMAGE_ORDER = "imageOrder";
    public static String FAVORITE_STATUS = "fStatus";
    public static String EX_TABLE_NAME = "ex";
    public static String EX_FOLDER_NAME = "folder";
    public static String EX_PROGRESS = "progress";
    public static String EX_KEY_ID = "KEY_ID";
    private static int DB_VERSION = 1;
    private static String DB_NAME = "favoriteDB";
    private static String TABLE_NAME = "favoriteListTable";
    private static String CREATE_FIRST_START = "CREATE TABLE " + FIRST_START_NAME + "(" + FIRST_START + " INT)";
    private static String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + KEY_ID + " TEXT," + ITEM_TITLE + " TEXT," + ITEM_DISK + " TEXT," + IMAGE_FOLDER + " " +
            "TEXT," + IMAGE_ORDER + " int," + FAVORITE_STATUS + " TEXT)";

    private static String CREATE_TABLE_EX = "CREATE TABLE " + EX_TABLE_NAME + " (" + EX_KEY_ID + " TEXT, " + EX_FOLDER_NAME +
            " TEXT, " + EX_PROGRESS + " int )";


    public FavDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_FIRST_START);
        db.execSQL(CREATE_TABLE_EX);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    //Inserting asset values to the table
    public void insertAssets() {
        //Insert exercise
        insertExercise();



        insertQ();
        insertNumberAssets();
        insertAnimalAssets();
        insertFamilyAssets();
        insertAlphabetAssets();
        insertMathsAssets();
        insertBodyAssets();
        insertAlbasatAssets();
        insertFoodAssets();
        insertVegetableAssets();
        insertDayAssets();
        insertFruitsAssets();
        insertAmharicFidel();
        insertNatureAssets();
        insertWildAnimal();
        insertColor();

        insertNames();
        insertWeeks();
        insertSpiritual();

    }

    private void insertQ() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "what.gif");
        cv.put(ITEM_TITLE, "ምን/What");
        cv.put(ITEM_DISK, "በቀኙ አመልካች ጣት በደረት ፊት ለፊት መዳፍ ወደ ውጪ \n" +
                "ሆኖ ወደ ግራና ቀኝ ማንቀሳቀስ፡፡");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "how.gif");
        cv.put(ITEM_TITLE, "እንዴት/How");
        cv.put(ITEM_DISK, "በሁለቱም እጆች ጎርበብ ባለ " +
                "“ሸ” የእጅ ቅርጽ በአይበሉባ በኩል በማነካከት " +
                "ጣቶች ወደ ሰውነት ሆነው በአንድ ላይ ወደ ውጪ በማዞር ማለያየትና የት በሚለው ምልክት መጨረስ፡፡");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "howm.gif");
        cv.put(ITEM_TITLE, "ስንት፣ምንያህል /How much");
        cv.put(ITEM_DISK, "\n" +
                "የቀኙን እጅ በደረት ትይዩ በጉርሻ መልክ በማዘጋጀት " +
                "በመቀጠል ጣቶችን መበተን፡፡\n");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "when.gif");
        cv.put(ITEM_TITLE, "መቼ/When");
        cv.put(ITEM_DISK, "\n" +
                "በሁለቱም እጆች አመልካች ጣት መዳፍ ወደ ላይ ሆኖ ሳይነካኩ ፊት ለፊት ማድረግና " +
                "በተከታታይ በመገልበጥ መዳፍን ወደ ታች ማድረግ፡፡\n");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "where.gif");
        cv.put(ITEM_TITLE, "የት/Where");
        cv.put(ITEM_DISK, "\n" +
                "በሁለቱም እጆች “ሸ” የእጅ ቅርጽ መዳፍ ወደ ላይ ሆኖ በደረት ትይዩ በትንሿ ጣት በኩል ማነካካትና በመለየት ቀኙን ወደ ቀኝ ግራውን ወደ ግራ መውሰድ፡፡");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "wrong.gif");
        cv.put(ITEM_TITLE, "አይደለም፣/Wrong");
        cv.put(ITEM_DISK, "\n" +
                "በቀኝ እጅ አመልካች ጣት መዳፍ ወደ ግራ አቅጣጫሆኖበግራትከሻአካባቢማድረግና ወደ ቀኝአቅጣጫበመውሰድየመዳፍአቅጣጫውን ወደ ውጪመለወጥ፡፡");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "and.gif");
        cv.put(ITEM_TITLE, "እና/And");
        cv.put(ITEM_DISK, "\n" +
                "በግራ አቅጣጫ ጎርበብ ብለው ተዘርግተው የሚገኙ የቀኝ እጅ ጣቶች ወደ ቀኝ እየወሰዱ በጉርሻ መልክ መጨረስ");
        cv.put(IMAGE_FOLDER, "q");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
    }

    private void insertSpiritual() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "angle.png");
        cv.put(ITEM_TITLE, "/Angele");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "angle.png");
        cv.put(ITEM_TITLE, "መላእክ/Angele");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bell.png");
        cv.put(ITEM_TITLE, "ደወል/Bell");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "drum.png");
        cv.put(ITEM_TITLE, "ከበሮ/Drum");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "God.png");
        cv.put(ITEM_TITLE, "እግዚአብሔር/God");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Islam.png");
        cv.put(ITEM_TITLE, "እስላም/Islam");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Jesus.png");
        cv.put(ITEM_TITLE, "እየሱስ/Jesus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "kirar.png");
        cv.put(ITEM_TITLE, "ክራር/kirar");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(ITEM_DISK, "No description");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "orthodox.png");
        cv.put(ITEM_TITLE, "ኦርቶዶክስ/orthodox");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "prayer.png");
        cv.put(ITEM_TITLE, "ጸሎት/prayer");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sistrum.png");
        cv.put(ITEM_TITLE, "ጸንስጽል/sistrum");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "song.png");
        cv.put(ITEM_TITLE, "መዝሙር/song");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "spiritual");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);


    }

    private void insertWeeks() {


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "monday.png");
        cv.put(ITEM_TITLE, "ሰኞ/Monday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tuesday.png");
        cv.put(ITEM_TITLE, "ማክሰኞ/Tuesday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "wdnesday.png");
        cv.put(ITEM_TITLE, "ሮብዕ/Wednesday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "thursday.png");
        cv.put(ITEM_TITLE, "ሐሙስ/Thursday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "friday.png");
        cv.put(ITEM_TITLE, "አርብ/Friday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "saturday.png");
        cv.put(ITEM_TITLE, "ቅዳሜ/Saturday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sunday.png");
        cv.put(ITEM_TITLE, "እሁድ/Sunday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "weeks");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
    }

    private void insertNames() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "bank.png");
        cv.put(ITEM_TITLE, "ባንክ/Bank");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "church.png");
        cv.put(ITEM_TITLE, "ቤተክርስቲያን/Church");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "driver.png");
        cv.put(ITEM_TITLE, "ሹፌር/Driver");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "farmer.png");
        cv.put(ITEM_TITLE, "ገበሬ/Farmer");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "guard.png");
        cv.put(ITEM_TITLE, "ዘበኛ/Guard");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hospital.png");
        cv.put(ITEM_TITLE, "ሆስፒታል/Hospital");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hotel.png");
        cv.put(ITEM_TITLE, "ሆቴል/Hotel");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "manager.png");
        cv.put(ITEM_TITLE, "ኃላፊ/Manager");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "market.png");
        cv.put(ITEM_TITLE, "ገበያ/Market");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "merchant.png");
        cv.put(ITEM_TITLE, "ነጋዴ/Merchant");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mill.png");
        cv.put(ITEM_TITLE, "ወፍጮ ቤት/Mill");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mosque.png");
        cv.put(ITEM_TITLE, "መስጊድ/Mosques");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "physician.png");
        cv.put(ITEM_TITLE, "ሐኪም/Physician");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "police.png");
        cv.put(ITEM_TITLE, "ፖሊስ/Police");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "post_office.png");
        cv.put(ITEM_TITLE, "ፖስታ ቤት/Post office");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "school.png");
        cv.put(ITEM_TITLE, "ትምህርት ቤት/School");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "shop.png");
        cv.put(ITEM_TITLE, "ሱቅ/Shop");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "solider.png");
        cv.put(ITEM_TITLE, "ወታደር/Solider");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "student.png");
        cv.put(ITEM_TITLE, "ተማሪ/Student");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "names");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
    }

    private void insertExercise() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(EX_KEY_ID, "alphabet");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "amharicFidel");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "body");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "number");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "family");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "days");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "numbers");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "maths");
        cv.put(EX_FOLDER_NAME, "basic");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        //Intermediate
        cv.put(EX_KEY_ID, "albasat");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "animal");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "color");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "food_drink");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "fruits");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "nature");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        cv.put(EX_KEY_ID, "vegetable");
        cv.put(EX_FOLDER_NAME, "intermediate");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);

        //Advance
        cv.put(EX_KEY_ID, "wild_animal");
        cv.put(EX_FOLDER_NAME, "advance");
        cv.put(EX_PROGRESS, 0);
        db.insert(EX_TABLE_NAME, null, cv);
    }

    private void insertColor() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "black.jpg");
        cv.put(ITEM_TITLE, "ጥቁር/Black");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "blue.jpg");
        cv.put(ITEM_TITLE, "ሰማያዊ/Blue");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "brown.jpg");
        cv.put(ITEM_TITLE, "ቡናማ/Brown");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "gray.jpg");
        cv.put(ITEM_TITLE, "ግራጫ/Grey");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "red.jpg");
        cv.put(ITEM_TITLE, "ቀይ/Red");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "white.jpg");
        cv.put(ITEM_TITLE, "ነጭ/White");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "yellow.jpg");
        cv.put(ITEM_TITLE, "ቢጫ/Yellow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "color");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
    }

    private void insertWildAnimal() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "ant.jpg");
        cv.put(ITEM_TITLE, "ጉንዳን/Ant");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "antelope.jpg");
        cv.put(ITEM_TITLE, "ድኩላ/Antelope");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bee.jpg");
        cv.put(ITEM_TITLE, "ንብ/Bee");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bird.jpg");
        cv.put(ITEM_TITLE, "ወፍ/Bird");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "butter_fly.jpg");
        cv.put(ITEM_TITLE, "ቢራቢሮ/Butter fly");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "crocodile.jpg");
        cv.put(ITEM_TITLE, "አዞ/Crocodile");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "duck.jpg");
        cv.put(ITEM_TITLE, "ዳኪዬ/Duck");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "elephant.jpg");
        cv.put(ITEM_TITLE, "ዝሆን/Elephant");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "elk.jpg");
        cv.put(ITEM_TITLE, "አጋዘን/Elk");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fish.jpg");
        cv.put(ITEM_TITLE, "አሳ/Fish");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fox.jpg");
        cv.put(ITEM_TITLE, "ቀበሮ/Fox");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "frog.jpg");
        cv.put(ITEM_TITLE, "እንቁራሪት/Frog");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "giraffe.jpg");
        cv.put(ITEM_TITLE, "ቀጭኔ/Giraffe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "grasshopper_locust.jpg");
        cv.put(ITEM_TITLE, "ፌንጣ፣ አንበጣ/Grasshopper locust");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hippopotamus.jpg");
        cv.put(ITEM_TITLE, "ጉማሬ/Hippopotamus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "house_fly.jpg");
        cv.put(ITEM_TITLE, "ዝንብ/House fly");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hyena.jpg");
        cv.put(ITEM_TITLE, "ጅብ/Hyena");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lion.jpg");
        cv.put(ITEM_TITLE, "አንበሳ/Lion");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lizard.jpg");
        cv.put(ITEM_TITLE, "እንሽላሊት/Lizard");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "monkey.jpg");
        cv.put(ITEM_TITLE, "ዝንጀሮ/Monkey");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "rabbit.jpg");
        cv.put(ITEM_TITLE, "ጥንቸል/Rabbit");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "rat.jpg");
        cv.put(ITEM_TITLE, "አይጥ/Rat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "rhino.jpg");
        cv.put(ITEM_TITLE, "አውራሪስ/Rhino");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "snake.jpg");
        cv.put(ITEM_TITLE, "እባብ/Snake");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "spider.jpg");
        cv.put(ITEM_TITLE, "ሸረሪት/Ant");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tiger.jpg");
        cv.put(ITEM_TITLE, "ነብር/Tiger");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tortoise.jpg");
        cv.put(ITEM_TITLE, "ዔሊ/Tortoise");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "zebra.jpg");
        cv.put(ITEM_TITLE, "የሜዳ አህያ/Zebra");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "wild_animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

    }

    private void insertAmharicFidel() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "hageaz.png");
        cv.put(ITEM_TITLE, "የአማርኛ የጣት ፊደላት/Amharic Fidel");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ha.png");
        cv.put(ITEM_TITLE, "ሀ/He");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "le.png");
        cv.put(ITEM_TITLE, "ለ/Le");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hha.png");
        cv.put(ITEM_TITLE, "ሐ/He");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "me.png");
        cv.put(ITEM_TITLE, "መ/Me");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "se.png");
        cv.put(ITEM_TITLE, "ሰ/Se");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "re.png");
        cv.put(ITEM_TITLE, "ረ/Re");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sse.png");
        cv.put(ITEM_TITLE, "ሠ/Se");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "she.png");
        cv.put(ITEM_TITLE, "ሸ/She");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "qe.png");
        cv.put(ITEM_TITLE, "ቀ/Qe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "be.png");
        cv.put(ITEM_TITLE, "በ/Be");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "te.png");
        cv.put(ITEM_TITLE, "ተ/Te");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "che.png");
        cv.put(ITEM_TITLE, "ቸ/Che");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hhha.png");
        cv.put(ITEM_TITLE, "ኀ/Ha");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 11);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ne.png");
        cv.put(ITEM_TITLE, "ነ/Ne");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 12);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "gne.png");
        cv.put(ITEM_TITLE, "ኘ/Gne");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 13);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "a.png");
        cv.put(ITEM_TITLE, "አ/A");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 14);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ke.png");
        cv.put(ITEM_TITLE, "ከ/Ke");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 15);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "khe.png");
        cv.put(ITEM_TITLE, "ኸ/Khe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 16);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "we.png");
        cv.put(ITEM_TITLE, "ወ/We");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "o.png");
        cv.put(ITEM_TITLE, "ዐ/Aa");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 18);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ze.png");
        cv.put(ITEM_TITLE, "ዘ/Ze");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 19);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "zhe.png");
        cv.put(ITEM_TITLE, "ዠ/Zje");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 20);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ye.png");
        cv.put(ITEM_TITLE, "የ/Ye");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 21);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "de.png");
        cv.put(ITEM_TITLE, "ደ/De");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 22);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "je.png");
        cv.put(ITEM_TITLE, "ጀ/Je");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 23);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ge.png");
        cv.put(ITEM_TITLE, "ገ/Ge");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 24);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tte.png");
        cv.put(ITEM_TITLE, "ጠ/Te");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 25);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "che.png");
        cv.put(ITEM_TITLE, "ጨ/Che");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 26);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "phe.png");
        cv.put(ITEM_TITLE, "ጰ/Pe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 27);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ppe.png");
        cv.put(ITEM_TITLE, "ጸ/Ppe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 28);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tseo.png");
        cv.put(ITEM_TITLE, "ፀ/Tse");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 28);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fe.png");
        cv.put(ITEM_TITLE, "ፈ/Fe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 28);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tseo.png");
        cv.put(ITEM_TITLE, "ፐ/pe");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 28);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ve.png");
        cv.put(ITEM_TITLE, "ሀ/Ve");
        cv.put(ITEM_DISK, "ሏ፣ ሗ፣ ሟ፣ ሧ፣ ሯ፣ ሷ፣ ሿ፣ ቋ፣ ቧ፣ ቷ፣ ቿ፣ ኋ፣ ኗ፣ ኟ፣ ኧ፣ ኳ፣ ዃ፣ ዟ፣ ዧ፣ ዷ፣ ጇ፣ ጔ፣ ጧ፣ ጯ፣ ጷ፣ ጿ፣ ፏ፣ እና ቯ፡፡ \n" +
                "በተመሳሳይ የግዕዝ  የጣት ፊደላት በመጠቀም እንቅስቃሴውን ብቻ ወደ ላይ ማድረግ ነው፡፡");
        cv.put(IMAGE_FOLDER, "amharicFidel");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 32);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertNumberAssets() {
        //Numbers

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "ዜሮ.png");
        cv.put(ITEM_TITLE, "ዜሮ/Zero");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "አንድ.png");
        cv.put(ITEM_TITLE, "አንድ/One");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "hulet.png");
        cv.put(ITEM_TITLE, "ሁለት/Two");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሶስት.png");
        cv.put(ITEM_TITLE, "ሶስት/Three");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "አራት.png");
        cv.put(ITEM_TITLE, "አራት/Four");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "አምስት.png");
        cv.put(ITEM_TITLE, "አምስት/Five");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ስድስት.png");
        cv.put(ITEM_TITLE, "ስድስት/Six");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሰባት.png");
        cv.put(ITEM_TITLE, "ሰባት/Seven");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ስምንት.png");
        cv.put(ITEM_TITLE, "ስምንት/Eight");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ዘጠኝ.png");
        cv.put(ITEM_TITLE, "ዘጠኝ/Nine");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "አስር.png");
        cv.put(ITEM_TITLE, "አስር/Ten");
        cv.put(ITEM_DISK, 0);
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሃያ.png");
        cv.put(ITEM_TITLE, "ሃያ/Twenty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 20);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሰላሳ.png");
        cv.put(ITEM_TITLE, "ሰላሳ/Thirty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 30);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "አርባ.png");
        cv.put(ITEM_TITLE, "አርባ/Forty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 40);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሃምሳ.png");
        cv.put(ITEM_TITLE, "ሃምሳ/Fifty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 50);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ስልሳ.png");
        cv.put(ITEM_TITLE, "ስልሳ/Sixty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 60);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሰባ.png");
        cv.put(ITEM_TITLE, "ሰባ/Seventy");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 70);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሰማኒያ.png");
        cv.put(ITEM_TITLE, "ሰማኒያ/Eighty");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 80);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ዘጠና.gif");
        cv.put(ITEM_TITLE, "ዘጠና/Ninety");
        cv.put(ITEM_DISK, 0);
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 90);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "መቶ.png");
        cv.put(ITEM_TITLE, "መቶ/Hundred");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 100);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ሺህ.png");
        cv.put(ITEM_TITLE, "ሺህ/Thousand");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "numbers");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1000);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertFamilyAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Family assets
        cv.put(KEY_ID, "he.png");
        cv.put(ITEM_TITLE, "እሱ/He");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "me.png");
        cv.put(ITEM_TITLE, "እኔ/Me");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "she.png");
        cv.put(ITEM_TITLE, "እሷ/She");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "you.png");
        cv.put(ITEM_TITLE, "አንተ/You");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "father.jpg");
        cv.put(ITEM_TITLE, "አባት/Father");
        cv.put(ITEM_DISK, "አባት/Father\t\t\n" +
                "በቀኝ እጅ “5” ቁጥር በአውራ ጣት በኩል ግንባርን ነክቶ ሌሎቹን ጣቶች ማንቀሳቀስ፡፡\n");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "mother.jpg");
        cv.put(ITEM_TITLE, "እናት/Mother");
        cv.put(ITEM_DISK, "እናት\n" +
                "በቀኝ እጅ “5” ቁጥር በአውራ ጣት በኩል አገጭን ነክቶ ሌሎቹን ጣቶች ማንቀሳቀስ፡፡ ወይም በቀኝ እጅ ጠት የማጥባት ድርጊት ማሳየት፡፡\n");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "child.gif");
        cv.put(ITEM_TITLE, "ህፃን/Baby");
        cv.put(ITEM_DISK, "በሁለት እጆች ህፃን ልጅ በሀሳብ መያዝን ማሳየት ወይም በ’ዘ’ እጅ በአፍንጫና ከንፈር መካከል ወደ ላይና ታች ማንቀሳቀስ፡፡");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "parent.gif");
        cv.put(ITEM_TITLE, "ወላጅ/Parent");
        cv.put(ITEM_DISK, "በ” ወ‘ የጣት ፊደል መጀመሪያ ግንባርን ነክቶ በመጨረሻ በአገጭ ላይ ማስቀመጥ፡፡");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "person.gif");
        cv.put(ITEM_TITLE, "ሰው/person");
        cv.put(ITEM_DISK, "የ”አ” የጣት ፊደልን በአይን አቅጣጫ በአየር ላይ በማሳየት ወደ ታች በመውሰድ መበተንና ወደ የ“5” የጣት ፊደል መለወጥ፡፡");
        cv.put(IMAGE_FOLDER, "family");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertAlphabetAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //ALPHABET
        cv.put(KEY_ID, "A.png");
        cv.put(ITEM_TITLE, "ኤ/A a");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
//
        cv.put(KEY_ID, "B.png");
        cv.put(ITEM_TITLE, " ቢ/B b");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "C.png");
        cv.put(ITEM_TITLE, "ሲ/C c");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "D.png");
        cv.put(ITEM_TITLE, " ዲ/D d");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "E.png");
        cv.put(ITEM_TITLE, " ኢ/E e");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "F.png");
        cv.put(ITEM_TITLE, " ኤፍ/F f");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "G.png");
        cv.put(ITEM_TITLE, " ጅ/G g");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "H.png");
        cv.put(ITEM_TITLE, " ኤች/H h");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "I.png");
        cv.put(ITEM_TITLE, " አይ/I i");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "J.png");
        cv.put(ITEM_TITLE, " ጄ/J j");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "K.png");
        cv.put(ITEM_TITLE, " ኬ/K k");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "L.png");
        cv.put(ITEM_TITLE, " ኤል/L l");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 11);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "M.png");
        cv.put(ITEM_TITLE, " ኤም/M m");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 12);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "N.png");
        cv.put(ITEM_TITLE, " ኤን/N n");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 13);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "O.png");
        cv.put(ITEM_TITLE, " ኦ/O o");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 14);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "P.png");
        cv.put(ITEM_TITLE, " ፒ/P p");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 15);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Q.png");
        cv.put(ITEM_TITLE, " ኪው/Q q");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 16);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "R.png");
        cv.put(ITEM_TITLE, " አር/R r");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "S.png");
        cv.put(ITEM_TITLE, " ኤስ/S s");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "T.png");
        cv.put(ITEM_TITLE, " ቲ/T t");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 18);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "U.png");
        cv.put(ITEM_TITLE, " ይው/U u");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 19);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "V.png");
        cv.put(ITEM_TITLE, " ቪ/V v");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 20);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "W.png");
        cv.put(ITEM_TITLE, " ደብሊው/W w");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 21);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "X.png");
        cv.put(ITEM_TITLE, " ኤክስ/X x");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 22);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Y.png");
        cv.put(ITEM_TITLE, " ዋይ/Y y");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 23);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Z.png");
        cv.put(ITEM_TITLE, " ዜድ/Z z");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 24);
        db.insert(TABLE_NAME, null, cv);


    }

    public void insertMathsAssets() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Maths
        cv.put(KEY_ID, "plus2.png");
        cv.put(ITEM_TITLE, "መደመር/Plus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "minus2.png");
        cv.put(ITEM_TITLE, "መቀነስ/Minus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "division.png");
        cv.put(ITEM_TITLE, "ማካፈል/Division");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "multiplication.png");
        cv.put(ITEM_TITLE, "ሰው/Multiplication");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "equals2.png");
        cv.put(ITEM_TITLE, "ይሆናል/Equals");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "greater_than2.png");
        cv.put(ITEM_TITLE, "ይበልጣል/Greater than");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "less_than.png");
        cv.put(ITEM_TITLE, "ያንሳል/Less than");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertBodyAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Inserting body part to the database
        cv.put(KEY_ID, "face.png");
        cv.put(ITEM_TITLE, "ፊት/face");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "ear.png");
        cv.put(ITEM_TITLE, "ጆሮ/ear");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hair.png");
        cv.put(ITEM_TITLE, "ጠጉር/hair");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hand.png");
        cv.put(ITEM_TITLE, "እጅ/hand");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mouse.png");
        cv.put(ITEM_TITLE, "አፍ/mouse");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "leg.png");
        cv.put(ITEM_TITLE, "እግር/leg");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "heart.png");
        cv.put(ITEM_TITLE, "ልብ/heart");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "neck.png");
        cv.put(ITEM_TITLE, "አንገት/neck");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "nose.png");
        cv.put(ITEM_TITLE, "አፍንጫ/nose");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "stomach.png");
        cv.put(ITEM_TITLE, "ሆድ/stomach");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "body");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertAlbasatAssets() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Albasat
        cv.put(KEY_ID, "belt.jpg");
        cv.put(ITEM_TITLE, "ቀበቶ/Belt");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cap.jpg");
        cv.put(ITEM_TITLE, "ኮፍያ /Cap");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "coat.jpg");
        cv.put(ITEM_TITLE, "ኮት/Coat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "dress.jpg");
        cv.put(ITEM_TITLE, "ቀሚስ/Dress");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pant.jpg");
        cv.put(ITEM_TITLE, "ፓንት/Pant");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sash.jpg");
        cv.put(ITEM_TITLE, "ሻሽ/Sash");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "scarf.jpg");
        cv.put(ITEM_TITLE, "ነጠላ/Scarf");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "shirt.jpg");
        cv.put(ITEM_TITLE, "ሸሚዝ/Shirt");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "shoes.jpg");
        cv.put(ITEM_TITLE, "ጫማ/Shoes");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "skirt.jpg");
        cv.put(ITEM_TITLE, "ጉርድ ቀሚስ/Skirt");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "slipper.jpg");
        cv.put(ITEM_TITLE, "ነጠላ ጫማ/Slipper");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "socks.jpg");
        cv.put(ITEM_TITLE, "ካልሲ/Socks");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 11);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sweater.jpg");
        cv.put(ITEM_TITLE, "ሹራብ/Sweater");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 12);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tie.jpg");
        cv.put(ITEM_TITLE, "ከረባት/Tie");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 13);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "trousers.jpg");
        cv.put(ITEM_TITLE, "ሱሪ/Trousers");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "albasat");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 14);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertFoodAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Food and drink
        cv.put(KEY_ID, "alchol.jpg");
        cv.put(ITEM_TITLE, "አልኮል መጠጥ/Alcohol");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bread.jpg");
        cv.put(ITEM_TITLE, "ዳቦ/Bread");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "butter.jpg");
        cv.put(ITEM_TITLE, "ቅቤ/Butter");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "candy.jpg");
        cv.put(ITEM_TITLE, "ከረሚላ/Candy");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "coffee.jpg");
        cv.put(ITEM_TITLE, "ቡና/Coffee");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "egg.jpg");
        cv.put(ITEM_TITLE, "እንቁላል/Egg");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "gruel.jpg");
        cv.put(ITEM_TITLE, "አጥሚት/Gruel");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "home_brear.jpg");
        cv.put(ITEM_TITLE, "ጠላ/Home Brear");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hony.jpg");
        cv.put(ITEM_TITLE, "ማር/Honey");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "injera.jpg");
        cv.put(ITEM_TITLE, "እንጀራ/Injera");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "macaroni.jpg");
        cv.put(ITEM_TITLE, "መኮሮኒ/Macaroni");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "meat.jpg");
        cv.put(ITEM_TITLE, "ስጋ/Meat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 11);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "milk.jpg");
        cv.put(ITEM_TITLE, "ወተት/Milk");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 12);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mush_made_of_peas.jpg");
        cv.put(ITEM_TITLE, "ሽሮ/Mush made of peas");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 13);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "oil.jpg");
        cv.put(ITEM_TITLE, "ዘይት/Oil");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 14);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pasta.jpg");
        cv.put(ITEM_TITLE, "ፓስታ/Pasta");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "porridge.jpg");
        cv.put(ITEM_TITLE, "ገንፎ/Porridge");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 15);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "salt.jpg");
        cv.put(ITEM_TITLE, "ጨው/Salt");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "soft_drink.jpg");
        cv.put(ITEM_TITLE, "ለስላሳ/Soft drink");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 16);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "soup.jpg");
        cv.put(ITEM_TITLE, "ሾርባ/Soup");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "stew.jpg");
        cv.put(ITEM_TITLE, "ወጥ/Stew");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 18);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sugar.jpg");
        cv.put(ITEM_TITLE, "ስኳር/Sugar");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 19);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tea.jpg");
        cv.put(ITEM_TITLE, "ሻይ/Tea");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 20);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "water.jpg");
        cv.put(ITEM_TITLE, "ውሃ/Water");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "food_drink");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 21);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertVegetableAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Vegetable
        cv.put(KEY_ID, "avocado.jpg");
        cv.put(ITEM_TITLE, "አቫካዶ/Avocado");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "banana.jpg");
        cv.put(ITEM_TITLE, "ሙዝ/Banana");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "beet_root.jpg");
        cv.put(ITEM_TITLE, "ቀይ ስር/Beet root");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);


        cv.put(KEY_ID, "cabbage.jpg");
        cv.put(ITEM_TITLE, "ጎመን/Cabbage");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "carrot.jpg");
        cv.put(ITEM_TITLE, "ካሮት/Cot");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "chili.jpg");
        cv.put(ITEM_TITLE, "ሚጥሚጣ/Chili");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "food.jpg");
        cv.put(ITEM_TITLE, "ምግብ/Food");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fruit.jpg");
        cv.put(ITEM_TITLE, "ፋራፍሬ/Fruit");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "invitation.jpg");
        cv.put(ITEM_TITLE, "ግብዣ/Invitation");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lemon.jpg");
        cv.put(ITEM_TITLE, "ሎሚ/Lemon");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lunch.jpg");
        cv.put(ITEM_TITLE, "ምሳ/Lunch");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mango.jpg");
        cv.put(ITEM_TITLE, "ማንጎ/mango");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "onion.jpg");
        cv.put(ITEM_TITLE, "ሽንኩርት/Onion");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "orange.jpg");
        cv.put(ITEM_TITLE, "ብርቱካን/Orange");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "papaya.jpg");
        cv.put(ITEM_TITLE, "ፓፓያ/Papaya");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pepper.jpg");
        cv.put(ITEM_TITLE, "ቃሪያ/Papper");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pine_apple.jpg");
        cv.put(ITEM_TITLE, "አናናስ/Pine apple");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pumpkin.jpg");
        cv.put(ITEM_TITLE, "ዱባ/Pumpkia");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "salad.jpg");
        cv.put(ITEM_TITLE, "ሰላጣ/Salad");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sugarcane.jpg");
        cv.put(ITEM_TITLE, "ሸንኮራ/Sugarcane");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "supper.jpg");
        cv.put(ITEM_TITLE, "እራት/Supper");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tomato.jpg");
        cv.put(ITEM_TITLE, "ቲማቲም/Tomato");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "vine.jpg");
        cv.put(ITEM_TITLE, "ወይን/Vine");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertAnimalAssets() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        //Animal
        cv.put(KEY_ID, "camel.jpg");
        cv.put(ITEM_TITLE, "ግመል/Camel");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cat.jpg");
        cv.put(ITEM_TITLE, "ድመት/Cat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "dog.jpg");
        cv.put(ITEM_TITLE, "ውሻ/dog");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cow.jpg");
        cv.put(ITEM_TITLE, "ላም/Cow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "donkey.jpg");
        cv.put(ITEM_TITLE, "አህያ/Donkey");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "goat.jpg");
        cv.put(ITEM_TITLE, "ፍየል/Goat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hen.jpg");
        cv.put(ITEM_TITLE, "ዶሮ/Hen");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "horse.jpg");
        cv.put(ITEM_TITLE, "ፈረስ/Horse");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mule.jpg");
        cv.put(ITEM_TITLE, "በቅሎ/Mule");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ox.jpg");
        cv.put(ITEM_TITLE, "በሬ/Ox");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pig.jpg");
        cv.put(ITEM_TITLE, "አሳማ/Pig");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sheep.jpg");
        cv.put(ITEM_TITLE, "በግ/Sheep");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertDayAssets() {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "now.png");
        cv.put(ITEM_TITLE, "አሁን/Now");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "past.png");
        cv.put(ITEM_TITLE, "ያለፈ/Past");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "afternoon.png");
        cv.put(ITEM_TITLE, "ከሰአት/Afternoon");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "always.png");
        cv.put(ITEM_TITLE, "ሁሌም/Always");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "day_after_tomorrow.png");
        cv.put(ITEM_TITLE, "ከነገ ወዲያ/Day after tomorrow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "day_before_yesterday.png");
        cv.put(ITEM_TITLE, "ከትላንት ወዲያ/Day before yesterday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "future.png");
        cv.put(ITEM_TITLE, "ወደፊት/Future");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "morning.png");
        cv.put(ITEM_TITLE, "ጠዋት/Morning");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "night.png");
        cv.put(ITEM_TITLE, "ምሽት/Night");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "today.png");
        cv.put(ITEM_TITLE, "ዛሬ/Today");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tomorrow.png");
        cv.put(ITEM_TITLE, "ነገ/Tomorrow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "summer.png");
        cv.put(ITEM_TITLE, "ክረምት/Summer");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "winter.png");
        cv.put(ITEM_TITLE, "በጋ/Winter");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "yesterday.png");
        cv.put(ITEM_TITLE, "ትላንት/Yesterday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);
    }

    public void insertFruitsAssets() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "barley.jpg");
        cv.put(ITEM_TITLE, "ገብስ/Barley");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bean.jpg");
        cv.put(ITEM_TITLE, "ባቄላ/Bean");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "chick_pean.jpg");
        cv.put(ITEM_TITLE, "ሽንብራ/Chick pean");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "false_banana.jpg");
        cv.put(ITEM_TITLE, "እንሰት/False banana");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lentil.jpg");
        cv.put(ITEM_TITLE, "ምስር/Lentil");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "maize.jpg");
        cv.put(ITEM_TITLE, "በቆሎ/Maize");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pea.jpg");
        cv.put(ITEM_TITLE, "ዓተር/Pea");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sorghum.jpg");
        cv.put(ITEM_TITLE, "ማሽላ/Sorghum");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "teff.jpg");
        cv.put(ITEM_TITLE, "ጤፍ/Teff");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "wheat.jpg");
        cv.put(ITEM_TITLE, "ስንዴ/Wheat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertNatureAssets() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "cloud.jpg");
        cv.put(ITEM_TITLE, "ዳመና/Cloud");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "field.jpg");
        cv.put(ITEM_TITLE, "ሜዳ/Field");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fire.jpg");
        cv.put(ITEM_TITLE, "እሳት/Fire");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "flower.jpg");
        cv.put(ITEM_TITLE, "አበባ/Flower");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "forest.jpg");
        cv.put(ITEM_TITLE, "ጫካ/Forest");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "grass.jpg");
        cv.put(ITEM_TITLE, "ሳር/Grass");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hail_ice_snow.jpg");
        cv.put(ITEM_TITLE, "በረዶ/Hail ice snow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "land.jpg");
        cv.put(ITEM_TITLE, "መሬት/Land");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lightening.jpg");
        cv.put(ITEM_TITLE, "መብረቅ/Lightening");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "moon.jpg");
        cv.put(ITEM_TITLE, "ጨረቃ/Moon");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mountain.jpg");
        cv.put(ITEM_TITLE, "ተራራ/Mountain");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "rain.jpg");
        cv.put(ITEM_TITLE, "ዝናብ/Rain");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "river.jpg");
        cv.put(ITEM_TITLE, "ወንዝ/River");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sea.jpg");
        cv.put(ITEM_TITLE, "ባህር/Sea");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sky.jpg");
        cv.put(ITEM_TITLE, "ሰማይ/Sky");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "star.jpg");
        cv.put(ITEM_TITLE, "ኮኮብ/Star");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "stone.jpg");
        cv.put(ITEM_TITLE, "ድንጋይ/Stone");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sun.jpg");
        cv.put(ITEM_TITLE, "ጸሀይ/Sun");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tree.jpg");
        cv.put(ITEM_TITLE, "ዛፍ/Tree");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "valley.jpg");
        cv.put(ITEM_TITLE, "ሸለቆ/Valley");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "waterfall.jpg");
        cv.put(ITEM_TITLE, "ፏፏቴ/Waterfall");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "wood.jpg");
        cv.put(ITEM_TITLE, "እንጨት/Wood");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "nature");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
    }

    //Inserting new data to the table
    public void insertData(String id, String title, String image, String status) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ITEM_TITLE, title);
        cv.put(IMAGE_FOLDER, image);
//        cv.put(ITEM_IMAGE, 0);
        cv.put(KEY_ID, id);
        cv.put(FAVORITE_STATUS, status);
        db.insert(TABLE_NAME, null, cv);
    }


    //read data by id
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public Cursor readDataById(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "select * from " + TABLE_NAME + " where " + KEY_ID + " ='" + id + "'";
        return db.rawQuery(sql, null, null);
    }

    //Update favorite status
    public void updateFavorite(String id, String status) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + TABLE_NAME + " SET " + FAVORITE_STATUS + "='" + status + "' WHERE " + KEY_ID + " ='" + id + "'";
        db.execSQL(sql);
    }

    //remove favorite by id
    public void removeFavoriteById(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + TABLE_NAME + " SET " + FAVORITE_STATUS + "='0' WHERE " + KEY_ID + " ='" + id + "'";
        db.execSQL(sql);
    }

    //select all favorite list
    public Cursor selectAllFavoriteList(String folder) {
        SQLiteDatabase db = this.getReadableDatabase();
//        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + FAVORITE_STATUS + " ='1' ";
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + FAVORITE_STATUS + " ='1' AND " + IMAGE_FOLDER + " ='" + folder + "'";
        return db.rawQuery(sql, null, null);

    }

    //select all list
    public Cursor selectAll(String folder) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + IMAGE_FOLDER + " = '" + folder + "' ORDER BY " + IMAGE_ORDER;
//        return db.rawQuery(sql, null, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return db.rawQuery(sql, null, null);
        } else {
            return null;
        }
    }

    //Select five sign language for exercise
    public Cursor selectRandomFive(String folder) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + IMAGE_FOLDER + " = '" + folder + "' ORDER BY RANDOM() LIMIT 5";
//        return db.rawQuery(sql, null, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return db.rawQuery(sql, null, null);
        } else {
            return null;
        }
    }

    //select all list
    public Cursor selectRandom(String folder) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + IMAGE_FOLDER + " = '" + folder + "' ORDER BY RANDOM() LIMIT 4";
//        return db.rawQuery(sql, null, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return db.rawQuery(sql, null, null);
        } else {
            return null;
        }
    }

    //IS FIRST START
    public Cursor isFirstStart() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + FIRST_START_NAME + " WHERE 1";
        return db.rawQuery(sql, null, null);
    }

    public void insertFirstStart() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FIRST_START, 1);
        db.insert(FIRST_START_NAME, null, cv);
    }

    public void removeFavoriteBy() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + TABLE_NAME + " SET " + FAVORITE_STATUS + "='0' WHERE 1";
        db.execSQL(sql);
    }

    //Inserting exercise progress
    public void insertProgress(String folder, String type, String progress) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(EX_KEY_ID, folder);
        cv.put(EX_FOLDER_NAME, type);
        cv.put(EX_PROGRESS, progress);
        db.insert(TABLE_NAME, null, cv);
    }

    //Update progress
    public void updateProgress(String folder, int progress) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + EX_TABLE_NAME + " SET " + EX_PROGRESS + "='" + progress + "' WHERE " + EX_KEY_ID + "='" + folder + "'";
        db.execSQL(sql);
    }

    public Cursor getProgress(String type) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT SUM (" + EX_PROGRESS + ") FROM " + EX_TABLE_NAME + " WHERE " + EX_FOLDER_NAME + " ='" + type + "'";
        return db.rawQuery(sql, null, null);
    }

    public void removeAllProgress() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + EX_TABLE_NAME + " SET " + EX_PROGRESS + "=0 WHERE 1";
        db.execSQL(sql);
    }
}
