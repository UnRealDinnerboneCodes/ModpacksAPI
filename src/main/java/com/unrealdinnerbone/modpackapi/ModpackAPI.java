package com.unrealdinnerbone.modpackapi;

import com.unrealdinnerbone.modpackapi.api.base.OS;
import com.unrealdinnerbone.modpackapi.api.pack.Modpack;
import com.unrealdinnerbone.modpackapi.api.version.Changelog;
import com.unrealdinnerbone.modpackapi.api.version.Version;
import com.unrealdinnerbone.modpackapi.api.popular.Popular;

public class ModpackAPI {

    public static Modpack getModpack(int modpack) {
        return get(Modpack.class, "public/modpack/" + modpack);
    }

    public static Version getVersionForModpack(int modpack, int version) {
        return get(Version.class, "public/modpack/" + modpack + "/" + version);
    }

    public static Changelog getVersionChangelog(int modpack, int version) {
        return get(Changelog.class, "public/modpack/"+ modpack + "/" + version + "/changelog");
    }

    public static Popular getTopPlays(int amount) {
        return get(Popular.class, "public/popular/plays/" + amount);
    }

    public static Popular getTopInstalls(int amount) {
        return get(Popular.class, "public/modpack/popular/installs/" + amount);
    }

    public static Popular getLastUpdated(int amount) {
        return get(Popular.class, "public/modpack/updated/" + amount);
    }

    public static Popular searchForPack(int amount, String term) {
        String encodedURL = ModpackAPIUtils.encode(term);
        return encodedURL != null ? get(Popular.class, "public/modpack/search/" + amount + "?term=" + encodedURL) : null;
    }

    public static String getServerDownloadURL(int modpack, int version, OS os) {
        return ModpackAPIUtils.BASE_URL + "public/moodpack" + modpack + "/" + version + "/" + os.name().toLowerCase();
    }

    public static <T> T get(Class<T> tClass, String base) {
        return ModpackAPIUtils.get(tClass, base);
    }


}
