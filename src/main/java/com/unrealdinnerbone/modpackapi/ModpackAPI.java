package com.unrealdinnerbone.modpackapi;

import com.unrealdinnerbone.modpackapi.api.modpack.*;
import com.unrealdinnerbone.modpackapi.api.mods.ModManifest;
import com.unrealdinnerbone.modpackapi.api.mods.ModSearch;
import com.unrealdinnerbone.modpackapi.api.tag.TagPopular;
import com.unrealdinnerbone.modpackapi.api.base.OS;
import com.unrealdinnerbone.modpackapi.api.modpack.version.Changelog;
import com.unrealdinnerbone.modpackapi.api.modpack.version.VersionManifest;
import com.unrealdinnerbone.modpackapi.util.ModpackAPIUtils;
import com.unrealdinnerbone.modpackapi.util.ReturnResult;

public class ModpackAPI {


    public static class Tags {
        public static ReturnResult<TagPopular> getMostUsedTag(int amount) {
            return get(TagPopular.class, "public/tag/popular/" + amount);
        }
    }

    public static class Mods {
        public static ReturnResult<ModSearch> searchForMods(int amount, String term) {
            return get(ModSearch.class, "public/mod/search/" + amount + "?term=" + ModpackAPIUtils.encode(term));
        }

        public static ReturnResult<ModManifest> getMod(int id) {
            return get(ModManifest.class, "public/mod/" + id);
        }
    }

    public static class Modpacks {
        public static ReturnResult<ModpackList> getRecentlyUpdated(int amount) {
            return get(ModpackList.class, "public/modpack/updated/" + amount);
        }

        public static ReturnResult<ModpackList> getFeatured(int amount) {
            return get(ModpackList.class, "public/modpack/featured/" + amount);
        }

        public static ReturnResult<ModpackPopularStatus> getMostPlayed(int amount) {
            return get(ModpackPopularStatus.class, "public/modpack/popular/plays/" + amount);
        }

        public static ReturnResult<ModpackPopularStatus> getMostInstalled(int amount) {
            return get(ModpackPopularStatus.class, "public/modpack/popular/installs/" + amount);
        }

        public static ReturnResult<PopularStatus> getMostPlayed(int amount, String tag) {
            return get(PopularStatus.class, "public/modpack/popular/plays/" + tag + "/" + amount);
        }

        public static ReturnResult<PopularStatus> getMostInstalled(int amount, String tag) {
            return get(PopularStatus.class, "public/modpack/popular/installs/" + tag + "/" + amount);
        }

        public static ReturnResult<ModpackSearch> searchForPack(int amount, String term) {
            String encodedURL = ModpackAPIUtils.encode(term);
            return encodedURL != null ? get(ModpackSearch.class, "public/modpack/search/" + amount + "?term=" + encodedURL) : null;
        }

        public static ReturnResult<ModpackManifest> getModpack(int modpack) {
            return get(ModpackManifest.class, "public/modpack/" + modpack);
        }

        public static ReturnResult<VersionManifest> getVersion(int modpack, int version) {
            return get(VersionManifest.class, "public/modpack/" + modpack + "/" + version);
        }

        public static ReturnResult<Changelog> getVersionChangelog(int modpack, int version) {
            return get(Changelog.class, "public/modpack/" + modpack + "/" + version + "/changelog");
        }

        public static ReturnResult<ModpackAll> getAll() {
            return get(ModpackAll.class, "public/modpack/all/");
        }

        public static String getServerDownload(int modpack, int version, OS os) {
            return ModpackAPIUtils.BASE_URL + "public/modpack/" + modpack + "/" + version + "/server/" + os.name().toLowerCase();
        }
    }

    public static class Curseforge {
        public static ReturnResult<ModpackManifest> getModpack(int modpack) {
            return get(ModpackManifest.class, "public/curseforge/" + modpack);
        }

        public static ReturnResult<VersionManifest> getVersion(int modpack, int version) {
            return get(VersionManifest.class, "public/curseforge/" + modpack + "/" + version);
        }
    }

    public static <T> ReturnResult<T> get(Class<T> tClass, String base) {
        return ModpackAPIUtils.get(tClass, base);
    }


}
