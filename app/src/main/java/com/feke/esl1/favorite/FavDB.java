package com.feke.esl1.favorite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class FavDB extends SQLiteOpenHelper {

    //Here is what i make a difference
    private String name = "Fekedew Hailemariam";
    private static int DB_VERSION = 1;
    private static String DB_NAME = "favoriteDB";
    private static String TABLE_NAME = "favoriteListTable";

    public static String FIRST_START = "id";
    public static String FIRST_START_NAME = "firstStart";


    public static String KEY_ID = "id";
    public static String ITEM_TITLE = "itemTitle";
    public static String ITEM_DISK = "itemDisk";
    public static String IMAGE_FOLDER = "imageFolder";
    public static String IMAGE_ORDER = "imageOrder";
    public static String FAVORITE_STATUS = "fStatus";


    private static String CREATE_FIRST_START = "CREATE TABLE " + FIRST_START_NAME + "(" + FIRST_START + " INT)";
    private static String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + KEY_ID + " TEXT," + ITEM_TITLE + " TEXT," + ITEM_DISK + " TEXT," + IMAGE_FOLDER + " " +
            "TEXT," + IMAGE_ORDER + " int," + FAVORITE_STATUS + " TEXT)";


    public FavDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_FIRST_START);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //Inserting asset values to the table
    public void insertAssets() {
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

    public void insertNumberAssets(){
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
        cv.put(ITEM_TITLE, "አርባ/Fourty");
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
    public void insertFamilyAssets(){

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
        cv.put(ITEM_TITLE, "ህፃን/Babby");
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
    public void insertAlphabetAssets(){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //ALPHABET
        cv.put(KEY_ID, "A.png");
        cv.put(ITEM_TITLE, "እሱ/A a");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);
//
        cv.put(KEY_ID, "B.png");
        cv.put(ITEM_TITLE, " b/B b");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "C.png");
        cv.put(ITEM_TITLE, " b/C c");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "D.png");
        cv.put(ITEM_TITLE, " b/D d");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "E.png");
        cv.put(ITEM_TITLE, " b/E e");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "F.png");
        cv.put(ITEM_TITLE, " b/F f");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "G.png");
        cv.put(ITEM_TITLE, " b/G g");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "H.png");
        cv.put(ITEM_TITLE, " b/H h");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 7);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "I.png");
        cv.put(ITEM_TITLE, " b/I i");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 8);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "J.png");
        cv.put(ITEM_TITLE, " b/J j");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 9);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "K.png");
        cv.put(ITEM_TITLE, " b/K k");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 10);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "L.png");
        cv.put(ITEM_TITLE, " b/L l");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 11);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "M.png");
        cv.put(ITEM_TITLE, " b/M m");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 12);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "N.png");
        cv.put(ITEM_TITLE, " b/N n");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 13);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "O.png");
        cv.put(ITEM_TITLE, " b/O o");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 14);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "P.png");
        cv.put(ITEM_TITLE, " b/P p");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 15);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Q.png");
        cv.put(ITEM_TITLE, " b/Q q");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 16);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "R.png");
        cv.put(ITEM_TITLE, " b/R r");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "S.png");
        cv.put(ITEM_TITLE, " b/S s");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 17);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "T.png");
        cv.put(ITEM_TITLE, " b/T t");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 18);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "U.png");
        cv.put(ITEM_TITLE, " b/U u");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 19);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "V.png");
        cv.put(ITEM_TITLE, " b/V v");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 20);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "W.png");
        cv.put(ITEM_TITLE, " b/W w");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 21);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "X.png");
        cv.put(ITEM_TITLE, " b/X x");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 22);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Y.png");
        cv.put(ITEM_TITLE, " b/Y y");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 23);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "Z.png");
        cv.put(ITEM_TITLE, " b/Z z");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "alphabet");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 24);
        db.insert(TABLE_NAME, null, cv);


    }
    public void insertMathsAssets(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Maths
        cv.put(KEY_ID, "plus.png");
        cv.put(ITEM_TITLE, "ሰው/Plus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "minus.png");
        cv.put(ITEM_TITLE, "ሰው/Minus");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "minus2.png");
        cv.put(ITEM_TITLE, "ሰው/Minus2");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "division.png");
        cv.put(ITEM_TITLE, "ሰው/Division");
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

        cv.put(KEY_ID, "equals.png");
        cv.put(ITEM_TITLE, "ሰው/Equals");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "equals2.png");
        cv.put(ITEM_TITLE, "ሰው/Equals");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "maths");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 6);
        db.insert(TABLE_NAME, null, cv);

    }

    public void insertBodyAssets(){

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
    public void insertAlbasatAssets(){
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
        cv.put(ITEM_TITLE,"ኮፍያ /Cap");
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
    public void insertFoodAssets(){

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

    public void insertVegetableAssets(){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //Vegetable
        cv.put(KEY_ID, "avocado.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Avocado");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "banana.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Banana");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "beet_root.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Beet root");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "breakfast.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Breakfast");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cabbage.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Cabbage");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "carrot.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Carrot");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "chili.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Chili");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "food.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Food");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "fruit.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Fruit");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "invitation.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Invitation");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lemon.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Lemon");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lunch.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Lunch");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mango.jpg");
        cv.put(ITEM_TITLE, "ሆድ/mango");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "onion.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Onion");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "orange.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Orange");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "papaya.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Papaya");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pepper.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Papper");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pine_apple.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Pine apple");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pumpkin.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Pumpkin");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "salad.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Salad");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sugarcane.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Sugarcane");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "supper.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Supper");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tomato.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Tomato");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "vine.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Vine");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "vegetable");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);
    }
    public void insertAnimalAssets(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        //Animal
        cv.put(KEY_ID, "camel.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Camel");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cat.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Cat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "dog.jpg");
        cv.put(ITEM_TITLE, "ሆድ/dog");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "cow.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Cow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "donkey.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Donkey");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "goat.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Goat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "hen.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Hen");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 4);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "horse.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Horse");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "mule.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Mule");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "ox.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Ox");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pig.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Pig");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 5);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sheep.jpg");
        cv.put(ITEM_TITLE, "ሆድ/Sheep");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "animal");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);
    }
    public void insertDayAssets(){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "now.png");
        cv.put(ITEM_TITLE, "h/Now");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "past.png");
        cv.put(ITEM_TITLE, "h/Past");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "afternoon.png");
        cv.put(ITEM_TITLE, "h/Afternoon");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "always.png");
        cv.put(ITEM_TITLE, "h/Always");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "day_after_tomorrow.png");
        cv.put(ITEM_TITLE, "h/Day after tomorrow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "day_before_yesterday.png");
        cv.put(ITEM_TITLE, "h/Day before yesterday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 1);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "future.png");
        cv.put(ITEM_TITLE, "h/Future");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "morning.png");
        cv.put(ITEM_TITLE, "h/Morning");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "night.png");
        cv.put(ITEM_TITLE, "h/Night");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "today.png");
        cv.put(ITEM_TITLE, "h/Today");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "tomorrow.png");
        cv.put(ITEM_TITLE, "h/Tomorrow");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "summer.png");
        cv.put(ITEM_TITLE, "h/Summer");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "winter.png");
        cv.put(ITEM_TITLE, "h/Winter");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 3);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "yesterday.png");
        cv.put(ITEM_TITLE, "h/Yesterday");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "days");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 2);
        db.insert(TABLE_NAME, null, cv);
    }
    public void insertFruitsAssets(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KEY_ID, "barley.jpg");
        cv.put(ITEM_TITLE, "h/Barley");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "bean.jpg");
        cv.put(ITEM_TITLE, "h/Bean");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "chick_pean.jpg");
        cv.put(ITEM_TITLE, "h/Chick pean");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "false_banana.jpg");
        cv.put(ITEM_TITLE, "h/False banana");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "lentil.jpg");
        cv.put(ITEM_TITLE, "h/Lentil");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "maize.jpg");
        cv.put(ITEM_TITLE, "h/Maize");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "pea.jpg");
        cv.put(ITEM_TITLE, "h/Pea");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "sorghum.jpg");
        cv.put(ITEM_TITLE, "h/Sorghum");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "teff.jpg");
        cv.put(ITEM_TITLE, "h/Teff");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
        cv.put(FAVORITE_STATUS, 0);
        cv.put(IMAGE_ORDER, 0);
        db.insert(TABLE_NAME, null, cv);

        cv.put(KEY_ID, "wheat.jpg");
        cv.put(ITEM_TITLE, "h/Wheat");
        cv.put(ITEM_DISK, "No description");
        cv.put(IMAGE_FOLDER, "fruits");
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
//        return db.rawQuery(sql, null, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return db.rawQuery(sql, null, null);
        } else {
            return null;
        }
    }

    public void insertFirstStart() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FIRST_START, 1);
        db.insert(FIRST_START_NAME, null, cv);
    }
}
