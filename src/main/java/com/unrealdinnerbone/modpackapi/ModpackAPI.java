package com.unrealdinnerbone.modpackapi;

import com.unrealdinnerbone.modpackapi.api.base.OS;
import com.unrealdinnerbone.modpackapi.api.pack.Modpack;
import com.unrealdinnerbone.modpackapi.api.popular.Popular;
import com.unrealdinnerbone.modpackapi.api.popular.PopularTyped;
import com.unrealdinnerbone.modpackapi.api.popular.TagPopular;
import com.unrealdinnerbone.modpackapi.api.version.Changelog;
import com.unrealdinnerbone.modpackapi.api.version.Version;
import com.unrealdinnerbone.modpackapi.util.ModpackAPIUtils;
import com.unrealdinnerbone.modpackapi.util.ReturnResult;

public class ModpackAPI {

    public static ReturnResult<TagPopular> getMostUsedTag(int amount) {
        return get(TagPopular.class, "public/tag/popular/" + amount);
    }

    public static ReturnResult<Popular> getRecentlyUpdated(int amount) {
        return get(Popular.class, "public/modpack/updated/" + amount);
    }

    public static ReturnResult<Popular> getFeatured(int amount) {
        return get(Popular.class, "public/modpack/featured/" + amount);
    }

    public static ReturnResult<PopularTyped> getMostPlayed(int amount) {
        return get(PopularTyped.class, "public/modpack/popular/plays/" + amount);
    }

    public static ReturnResult<PopularTyped> getMostInstalled(int amount) {
        return get(PopularTyped.class, "public/modpack/popular/installs/" + amount);
    }

    public static ReturnResult<Popular> getMostPlayed(int amount, String tag) {
        return get(Popular.class, "public/modpack/popular/plays/" + tag + "/" + amount);
    }

    public static ReturnResult<Popular> getMostInstalled(int amount, String tag) {
        return get(Popular.class, "public/modpack/popular/installs/" + tag + "/" + amount);
    }

    public static ReturnResult<Modpack> getModpack(int modpack) {
        return get(Modpack.class, "public/modpack/" + modpack);
    }

    public static ReturnResult<Version> getVersion(int modpack, int version) {
        return get(Version.class, "public/modpack/" + modpack + "/" + version);
    }

    public static ReturnResult<Changelog> getVersionChangelog(int modpack, int version) {
        return get(Changelog.class, "public/modpack/" + modpack + "/" + version + "/changelog");
    }

    public static ReturnResult<Popular> getTopPlayed(String tag, int amount) {
        return get(Popular.class, "public/modpack/featured/" + amount);
    }

    public static ReturnResult<Popular> searchForPack(int amount, String term) {
        String encodedURL = ModpackAPIUtils.encode(term);
        return encodedURL != null ? get(Popular.class, "public/modpack/search/" + amount + "?term=" + encodedURL) : null;
    }

    public static String getServerDownloadURL(int modpack, int version, OS os) {
        return ModpackAPIUtils.BASE_URL + "public/modpack/" + modpack + "/" + version + "/server/" + os.name().toLowerCase();
    }

    public static <T> ReturnResult<T> get(Class<T> tClass, String base) {
        return ModpackAPIUtils.get(tClass, base);
    }


}
